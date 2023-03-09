package br.com.samaanfilho.gitlab.search.service;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import br.com.samaanfilho.gitlab.search.dto.BuscaDTO;
import br.com.samaanfilho.gitlab.search.json.Project;

@Service
public class InitialService {

	public static final Logger logger = LogManager.getLogger(InitialService.class);

	private final GitLabSearchService gitlab;
	private final String[] termos;
	
	public InitialService(@Value("${termo}") String[] termos, final GitLabSearchService gitlab) {
		this.termos = termos;
		this.gitlab = gitlab;
	}

	@EventListener(ApplicationReadyEvent.class)
	public void buscarTermo() {
		logger.info("Iniciando processo para busca do termo '{}'", Arrays.toString(this.termos));

		List<Project> projetos = gitlab.listarProjetos();
		try {
			BuscaDTO busca = gitlab.buscarTextoNosProjetos(projetos, this.termos);
			logger.info(busca);
		} catch (InterruptedException | ExecutionException e) {
			throw new RuntimeException("Erro ao execucao processo paralelo", e);
		}

		System.exit(0);
	}

}
