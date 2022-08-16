package br.com.devti.gestaorestaurantes.core.bo;

import java.util.List;

import br.com.devti.gestaorestaurantes.core.dao.ProdutosDAO;
import br.com.devti.gestaorestaurantes.core.entity.ProdutosEntity;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class ProdutosBO {

	public String salvar(ProdutosEntity produto) throws NegocioException {
		System.out.println("Camada BO, processando informações Produtos");
		
		if(produto.getNomeProduto() == null || produto.getNomeProduto().equals("")) {
			throw new NegocioException("O nome do produto precisa ser preenchido");
		}
		
		ProdutosDAO produtoDao = new ProdutosDAO();		
		return produtoDao.salvar(produto);
	}

	public static List<ProdutosEntity> listar() throws NegocioException {
		return ProdutosDAO.listar();
	}



}
