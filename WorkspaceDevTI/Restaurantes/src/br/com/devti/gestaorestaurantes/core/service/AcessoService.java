package br.com.devti.gestaorestaurantes.core.service;

import br.com.devti.gestaorestaurantes.core.bo.AcessoBO;
import br.com.devti.gestaorestaurantes.core.entity.AcessoEntity;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class AcessoService {
	public boolean verificarAcessoUsuario(AcessoEntity acessoUsuario) throws NegocioException {
		System.out.println("Entrando no backend, camada service Acesso Usuario...");
		
		AcessoBO bo = new AcessoBO();
	    return bo.verificarAcessoUsuario(acessoUsuario);
	}
}
