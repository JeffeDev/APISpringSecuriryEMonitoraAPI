package br.com.devti.gestaorestaurantes.core.entity;

import java.io.Serializable;
import java.util.Objects;

public class LiberacaoUsuarioEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long idLiberacaoUsuario;
	private UsuarioEntity usuario;
	private GrupoUsuarioEntity grupoUsuario;
	private RecursoEntity recurso;
	
	public Long getCodigo() {
		return idLiberacaoUsuario;
	}
	public void setCodigo(Long codigo) {
		this.idLiberacaoUsuario = codigo;
	}
	public UsuarioEntity getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioEntity usuario) {
		this.usuario = usuario;
	}
	public GrupoUsuarioEntity getGrupoUsuario() {
		return grupoUsuario;
	}
	public void setGrupoUsuario(GrupoUsuarioEntity grupoUsuario) {
		this.grupoUsuario = grupoUsuario;
	}
	public RecursoEntity getRecurso() {
		return recurso;
	}
	public void setRecurso(RecursoEntity recurso) {
		this.recurso = recurso;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(idLiberacaoUsuario);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LiberacaoUsuarioEntity other = (LiberacaoUsuarioEntity) obj;
		return Objects.equals(idLiberacaoUsuario, other.idLiberacaoUsuario);
	}
		
}
