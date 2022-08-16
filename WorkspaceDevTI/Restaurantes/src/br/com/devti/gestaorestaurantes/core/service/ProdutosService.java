package br.com.devti.gestaorestaurantes.core.service;

import java.util.List;

import br.com.devti.gestaorestaurantes.core.bo.ProdutosBO;
import br.com.devti.gestaorestaurantes.core.entity.ProdutosEntity;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class ProdutosService {

	public String salvar(ProdutosEntity produto) throws NegocioException {
	    ProdutosBO produtoBo = new ProdutosBO();
	    return produtoBo.salvar(produto);
	}
	
	public static List<ProdutosEntity> listar() throws NegocioException {
		return ProdutosBO.listar();
	}
}