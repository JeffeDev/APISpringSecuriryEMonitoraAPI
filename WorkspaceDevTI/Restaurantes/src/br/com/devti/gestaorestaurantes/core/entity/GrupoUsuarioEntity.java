package br.com.devti.gestaorestaurantes.core.entity;

import java.io.Serializable;
import java.util.Objects;

public class GrupoUsuarioEntity implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long idGrupoUsuario;
	private String nomeGrupo;
	
	public Long getCodigo() {
		return idGrupoUsuario;
	}
	public void setCodigo(Long codigo) {
		this.idGrupoUsuario = codigo;
	}
	public String getNomeGrupo() {
		return nomeGrupo;
	}
	public void setNomeGrupo(String nomeGrupo) {
		this.nomeGrupo = nomeGrupo;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(idGrupoUsuario);
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
		return Objects.equals(idGrupoUsuario, other.idGrupoUsuario);
	}
	
	
}
