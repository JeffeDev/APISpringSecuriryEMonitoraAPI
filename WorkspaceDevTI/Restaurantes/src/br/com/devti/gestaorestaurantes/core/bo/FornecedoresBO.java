package br.com.devti.gestaorestaurantes.core.bo;

import java.util.List;

import br.com.devti.gestaorestaurantes.core.dao.FornecedoresDAO;
import br.com.devti.gestaorestaurantes.core.entity.FornecedoresEntity;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class FornecedoresBO {


	public String excluir(Long id) throws NegocioException {
		return new FornecedoresDAO().excluir(id);
	}

	public static FornecedoresEntity buscaPorId(Long id) throws NegocioException {
		return FornecedoresDAO.buscaPorId(id);
	}

	public String alterarDadosFornecedores(FornecedoresEntity fornec) throws NegocioException {
	    FornecedoresDAO fornecedoresDao = new FornecedoresDAO();
	    return fornecedoresDao.alterarDadosFornecedores(fornec);
	}

	public String salvarDadosFornecedores(FornecedoresEntity fornec) throws NegocioException {
		
		ValidarCamposfornec(fornec);
		
		FornecedoresDAO udao = new FornecedoresDAO();		
		return udao.salvarDadosFornecedores(fornec);
	}

	private void ValidarCamposfornec(FornecedoresEntity fornec) throws NegocioException {
		System.out.println("Camada BO, processando informações");
		
		// TODO Poderia criptografar a senha
		// TODO Poderia validar o restante das informações
		
		if(fornec.getRazao() == null || fornec.getRazao().equals("")) {
			throw new NegocioException("O nome do usuário precisa ser preenchido");
		}
	}

	public static List<FornecedoresEntity> listar() throws NegocioException {
		return FornecedoresDAO.listarDadosFornecedores();
	}

	public static List<FornecedoresEntity> listarDadosFornecedores() throws NegocioException {
		return FornecedoresDAO.listarDadosFornecedores();
	}

}
