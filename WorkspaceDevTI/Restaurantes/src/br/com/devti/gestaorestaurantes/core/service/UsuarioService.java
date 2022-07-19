package br.com.devti.gestaorestaurantes.core.service;

import java.util.List;

import br.com.devti.gestaorestaurantes.core.bo.UsuarioBO;
import br.com.devti.gestaorestaurantes.core.entity.UsuarioEntity;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class UsuarioService {

	public String salvarUsuario(UsuarioEntity usuario) throws NegocioException {
		System.out.println("Entrando no backend, camada service...");
	    UsuarioBO usuarioBo = new UsuarioBO();
	    return usuarioBo.salvarUsuario(usuario);
	}
	
	public List<UsuarioEntity> listarUsuario() throws NegocioException{
		return UsuarioBO.listarUsuario();
	}
	
}