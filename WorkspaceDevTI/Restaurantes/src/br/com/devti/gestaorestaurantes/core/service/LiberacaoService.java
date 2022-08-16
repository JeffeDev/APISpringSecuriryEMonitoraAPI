package br.com.devti.gestaorestaurantes.core.service;

import java.util.List;

import br.com.devti.gestaorestaurantes.core.bo.LiberacaoBO;
import br.com.devti.gestaorestaurantes.core.entity.LiberacaoUsuarioEntity;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class LiberacaoService {
	
	public String salvar(LiberacaoUsuarioEntity liberacaoUsuario) throws NegocioException {
		System.out.println("Entrando no backend LiberacaoUsuario, camada service...");
	    LiberacaoBO liberacaoUsuarioBo = new LiberacaoBO();
	    return liberacaoUsuarioBo.salvar(liberacaoUsuario);
	}
	
	public List<LiberacaoUsuarioEntity> listar() throws NegocioException{
		LiberacaoBO liberacaoUsuarioBo;
		return LiberacaoBO.listar();
	}
}
