package br.com.devti.gestaorestaurantes.core.service;

import br.com.devti.gestaorestaurantes.core.bo.GrupoUsuarioBO;
import br.com.devti.gestaorestaurantes.core.entity.GrupoUsuarioEntity;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class GrupoUsuarioService {
	public String salvarGrupoUsuario(GrupoUsuarioEntity grupoUsuario) throws NegocioException {
		System.out.println("Entrando no backend, camada service...");
		
		GrupoUsuarioBO bo = new GrupoUsuarioBO();
	    return bo.salvarGrupoUsuario(grupoUsuario);
	}
}
