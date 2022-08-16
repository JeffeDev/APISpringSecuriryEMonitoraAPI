package br.com.devti.gestaorestaurantes.core.entity;

import java.io.Serializable;
import java.util.Objects;

public class GrupoUsuarioEntity implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nomeGrupo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long codigo) {
		this.id = codigo;
	}
	public String getNomeGrupo() {
		return nomeGrupo;
	}
	public void setNomeGrupo(String nomeGrupo) {
		this.nomeGrupo = nomeGrupo;
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
		GrupoUsuarioEntity other = (GrupoUsuarioEntity) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
