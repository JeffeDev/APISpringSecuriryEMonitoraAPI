package br.com.devti.gestaorestaurantes.core.service;

import java.util.List;

import br.com.devti.gestaorestaurantes.core.bo.GrupoUsuarioBO;
import br.com.devti.gestaorestaurantes.core.entity.GrupoUsuarioEntity;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class GrupoUsuarioService {
	public String salvar(GrupoUsuarioEntity grupoUsuario) throws NegocioException {
		System.out.println("Entrando no backend, camada service...");
		
		GrupoUsuarioBO grupoUsuarioBo = new GrupoUsuarioBO();
	    return grupoUsuarioBo.salvar(grupoUsuario);
	}
	public List<GrupoUsuarioEntity> listar() throws NegocioException{
		GrupoUsuarioBO grupoUsuarioBo;
		return GrupoUsuarioBO.listar();
	}
}
