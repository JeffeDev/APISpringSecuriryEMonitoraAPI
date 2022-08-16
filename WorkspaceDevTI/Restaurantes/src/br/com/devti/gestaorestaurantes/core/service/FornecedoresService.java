package br.com.devti.gestaorestaurantes.core.service;

import java.util.List;

import br.com.devti.gestaorestaurantes.core.bo.FornecedoresBO;
import br.com.devti.gestaorestaurantes.core.entity.FornecedoresEntity;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class FornecedoresService {
	public String salvar(FornecedoresEntity fornecedores) throws NegocioException {
		System.out.println("Entrando no backend, camada service...");
		
		FornecedoresBO bo = new FornecedoresBO();
	    return bo.salvar(fornecedores);
	}
	public List<FornecedoresEntity> listar() throws NegocioException{
		FornecedoresBO fornecedoresBo;
		return FornecedoresBO.listar();
	}
}
