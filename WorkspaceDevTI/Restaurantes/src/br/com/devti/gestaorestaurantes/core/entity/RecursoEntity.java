package br.com.devti.gestaorestaurantes.core.entity;

import java.io.Serializable;
import java.util.Objects;

public class RecursoEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private String nomeRecurso;
	private String caminhoTela;
	
	
	
	public Long getid() {
		return id;
	}
	public void setid(Long id) {
		this.id = id;
	}
	public String getNomeRecurso() {
		return nomeRecurso;
	}
	public void setNomeRecurso(String nomeRecurso) {
		this.nomeRecurso = nomeRecurso;
	}
	public String getCaminhoTela() {
		return caminhoTela;
	}
	public void setCaminhoTela(String caminhoTela) {
		this.caminhoTela = caminhoTela;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RecursoEntity other = (RecursoEntity) obj;
		return Objects.equals(id, other.id);
	}	
	
}
