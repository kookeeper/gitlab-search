package br.com.samaanfilho.gitlab.search.dto;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class BuscaDTO {
	
	private Map<String, Set<String>> termos = new HashMap<>();
	
	public Set<String> getTermos() {
		return this.termos.keySet();
	}

	public void addTermo(final String termo) {
		termos.putIfAbsent(termo, new HashSet<>());
	}
	
	public Set<String> getProjetos(final String termo) {
		return termos.getOrDefault(termo, new HashSet<>());
	}
	
	public void addProjeto(final String termo, final String projeto) {
		this.getProjetos(termo).add(projeto);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(termos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BuscaDTO other = (BuscaDTO) obj;
		return Objects.equals(termos, other.termos);
	}

	@Override
	public String toString() {
		return "BuscaDTO [termos=" + termos + "]";
	}

}
