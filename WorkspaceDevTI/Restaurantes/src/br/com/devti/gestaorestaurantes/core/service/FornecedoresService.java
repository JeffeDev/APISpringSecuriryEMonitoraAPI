package br.com.devti.gestaorestaurantes.core.service;

import java.util.List;

import br.com.devti.gestaorestaurantes.core.bo.FornecedoresBO;
import br.com.devti.gestaorestaurantes.core.entity.FornecedoresEntity;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class FornecedoresService {

	public String alterarDadosFornecedores(FornecedoresEntity fornec) throws NegocioException {
	    FornecedoresBO fornecedoresBO = new FornecedoresBO();
	    return fornecedoresBO.alterarDadosFornecedores(fornec);
	}
	
	
	public FornecedoresEntity buscaPorId(long id) throws NegocioException {
		return FornecedoresBO.buscaPorId(id);
	}
	
	public String excluir(Long Id) throws NegocioException {
		return new FornecedoresBO().excluir(Id);
	}
	public String salvarDadosFornecedores(FornecedoresEntity fornec) throws NegocioException {
		System.out.println("Entrando no backend, camada service Salvar Novo Fornecedores...");
	    FornecedoresBO fornecedoresBO = new FornecedoresBO();
	    return fornecedoresBO.salvarDadosFornecedores(fornec);
	}
	
	public List<FornecedoresEntity> listar() throws NegocioException{
		return FornecedoresBO.listar();
	}
	
	public List<FornecedoresEntity> listarDadosFornecedores() throws NegocioException {
		return FornecedoresBO.listarDadosFornecedores();
	}
}
