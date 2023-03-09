package br.com.kookeeper.gitlab.search.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class FileService {
	
	private final String nomeArquivo;
	
	public FileService(@Value("${nome_arquivo}") final String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
	
	public void gravarRegistro(final String texto) throws IOException {
		FileWriter writer = abrirArquivo();
		writer.append(texto + '\n');
		writer.close();
	}

	public boolean buscarRegistro(final String texto) throws IOException {
		try {
			BufferedReader reader = lerArquivo();
			String linha = null;
			while ((linha = reader.readLine()) != null) {
				if (linha.contains(texto)) {
					return true;
				}
			}
		} catch (FileNotFoundException e) {
			return false;
		}
		return false;
	}
	
	private FileWriter abrirArquivo() throws IOException {
		return new FileWriter(new File(nomeArquivo), true);
	}
	
	private BufferedReader lerArquivo() throws FileNotFoundException {
		return new BufferedReader(new FileReader(new File(nomeArquivo)));
	}

}
