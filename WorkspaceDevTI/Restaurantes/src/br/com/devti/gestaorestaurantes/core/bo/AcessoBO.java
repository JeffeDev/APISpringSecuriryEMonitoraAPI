package br.com.devti.gestaorestaurantes.core.bo;

import br.com.devti.gestaorestaurantes.core.dao.AcessoDAO;
import br.com.devti.gestaorestaurantes.core.entity.AcessoEntity;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class AcessoBO {
	
	public boolean verificarAcessoUsuario(AcessoEntity acessoUsuario) throws NegocioException {
		System.out.println("Camada BO, Validando campos para Acesso ao sistema");
		
		if(acessoUsuario.getLogin() == null || acessoUsuario.getLogin().equals("")) {
			throw new NegocioException("O login precisa ser preenchido");
		}
		
		AcessoDAO acessoUsuarioDao = new AcessoDAO();		
		return acessoUsuarioDao.verificarAcessoUsuario(acessoUsuario);
	}
}
