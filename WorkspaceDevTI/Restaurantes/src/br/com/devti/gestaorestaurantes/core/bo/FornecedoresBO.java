package br.com.devti.gestaorestaurantes.core.bo;

import java.util.List;

import br.com.devti.gestaorestaurantes.core.dao.FornecedoresDAO;
import br.com.devti.gestaorestaurantes.core.entity.FornecedoresEntity;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class FornecedoresBO {

	public String salvar(FornecedoresEntity fornecedores) throws NegocioException {
		System.out.println("Camada BO, processando informações Fornecedores");
		
		if(fornecedores.getNomeFornecedor() == null || fornecedores.getNomeFornecedor().equals("")) {
			throw new NegocioException("O nome do Fornecedores precisa ser preenchido");
		}
		
		FornecedoresDAO fornecedoresDao = new FornecedoresDAO();		
		return fornecedoresDao.salvar(fornecedores);
	}
	
	public static List<FornecedoresEntity> listar() throws NegocioException{
		return FornecedoresDAO.listar();
	}

}
