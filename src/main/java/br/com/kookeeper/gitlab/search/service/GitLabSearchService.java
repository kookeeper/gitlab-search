package br.com.kookeeper.gitlab.search.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException.InternalServerError;

import br.com.kookeeper.gitlab.search.dto.BuscaDTO;
import br.com.kookeeper.gitlab.search.json.Project;
import br.com.kookeeper.gitlab.search.json.Search;

import org.springframework.web.client.RestTemplate;

@Service
public class GitLabSearchService {

	public static final Logger logger = LogManager.getLogger(GitLabSearchService.class);

	private final RestTemplate restTemplate;
	private final String privateToken;
	private final String gitEndpoint;
	private final Integer threadSize;
	
	public GitLabSearchService(final RestTemplate restTemplate,
			@Value("${git.privateToken}") final String privateToken,
			@Value("${git.endpoint}") final String gitEndpoint,
			@Value("${pool.thread}") final Integer threadSize) {
		this.restTemplate = restTemplate;
		this.privateToken = privateToken;
		this.gitEndpoint = gitEndpoint;
		this.threadSize = threadSize;
	}

	public BuscaDTO buscarTextoNosProjetos(final List<Project> projetos, final String[] termos) throws InterruptedException, ExecutionException {
		logger.info("Iniciando a busca do texto '{}'.", Arrays.toString(termos));
		BuscaDTO resultado = new BuscaDTO();
		for (String termo : termos) {
			resultado.addTermo(termo);
		}
		ForkJoinPool customThreadPool = new ForkJoinPool(threadSize);

		customThreadPool.submit(() -> projetos.parallelStream().forEach(projeto -> {
			resultado.getTermos().parallelStream().forEach(termo -> {
				try {
					if (buscarTextoNoProjeto(projeto, termo)) {
						resultado.addProjeto(termo, projeto.getHttpUrlToRepo());
						logger.info(projeto.getHttpUrlToRepo() + ": encontrou");
					} else {
						logger.debug(projeto.getHttpUrlToRepo() + ": nao encontrou");
					}
				} catch (InternalServerError e) {
					logger.error("Erro ao acessar projeto " + projeto.getId() + ": " + e.getLocalizedMessage());
				}
			});
		})).get();

		customThreadPool.shutdown();

		logger.info("Finalizando a busca do texto '{}'.", Arrays.toString(termos));
		return resultado;
	}

	private boolean buscarTextoNoProjeto(final Project projeto, final String topico) {
		try {
			if (buscarTexto(projeto, topico)) {
				logger.debug(projeto.getHttpUrlToRepo() + ": encontrou");
				return true;
			} else {
				logger.debug(projeto.getHttpUrlToRepo() + ": nao encontrou");
			}
		} catch (InternalServerError e) {
			logger.error("Erro ao acessar projeto {} no endpoint {}: {}.", projeto.getId(), projeto.getHttpUrlToRepo(), e.getLocalizedMessage());
		}
		return false;
	}

	public List<Project> listarProjetos() {
		List<Project> projetos = new ArrayList<>();
		int page = 0;
		
		logger.info("Iniciando busca de projetos");
		do {
			projetos.addAll(Arrays.asList(listarProjetos(page++)));
		} while (projetos.size() == 100 * page);

		logger.info("Projetos encontrados: " + projetos.size());

		return projetos;
	}

	private Project[] listarProjetos(int page) {
		String url = gitEndpoint + "projects?private_token=" + privateToken + "&per_page=100&page="
				+ page;

		ResponseEntity<Project[]> response = restTemplate.getForEntity(url, Project[].class);
		logger.debug("Lista parcial de projetos encontrados: " + response.getBody().length);
		return response.getBody();
	}

	private boolean buscarTexto(Project projeto, String texto) {

		String url = gitEndpoint + "projects/" + projeto.getId()
				+ "/search?private_token=" + privateToken + "&scope=blobs&search=" + texto;

		ResponseEntity<Search[]> resposta = restTemplate.getForEntity(url, Search[].class);

		return resposta.getBody().length > 0;
	}

	public BuscaDTO buscarDependenciaMaven(Project projeto, List<String> listaTopicos) {
		// TODO Auto-generated method stub
		return null;
	}

}
