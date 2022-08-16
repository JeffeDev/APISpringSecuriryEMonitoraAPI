package br.com.devti.gestaorestaurantes.core.bo;

import java.util.List;

import br.com.devti.gestaorestaurantes.core.dao.RecursoDAO;
import br.com.devti.gestaorestaurantes.core.entity.RecursoEntity;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class RecursoBO {
	
	public String salvar(RecursoEntity recurso) throws NegocioException {
		System.out.println("Camada BO, processando informações Recurso");
		
		if(recurso.getNomeRecurso() == null || recurso.getNomeRecurso().equals("")) {
			throw new NegocioException("O nome do usuário precisa ser preenchido");
		}
		
		RecursoDAO recursoDao = new RecursoDAO();		
		return recursoDao.salvar(recurso);
	}

	public static List<RecursoEntity> listar() throws NegocioException {
		return RecursoDAO.listar();
	}



}
