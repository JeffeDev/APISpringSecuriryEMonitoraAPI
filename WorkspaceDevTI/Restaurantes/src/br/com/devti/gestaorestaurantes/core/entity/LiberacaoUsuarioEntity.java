package br.com.devti.gestaorestaurantes.core.entity;

import java.io.Serializable;

public class LiberacaoUsuarioEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Long idUsuario;
	private Long idGrupoUsuario;
	private Long idRecurso;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public Long getIdGrupoUsuario() {
		return idGrupoUsuario;
	}
	public void setIdGrupoUsuario(Long idGrupoUsuario) {
		this.idGrupoUsuario = idGrupoUsuario;
	}
	public Long getIdRecurso() {
		return idRecurso;
	}
	public void setIdRecurso(Long idRecurso) {
		this.idRecurso = idRecurso;
	}
	
}
