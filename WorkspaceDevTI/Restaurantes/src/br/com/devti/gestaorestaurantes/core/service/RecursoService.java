package br.com.devti.gestaorestaurantes.core.service;

import java.util.List;

import br.com.devti.gestaorestaurantes.core.bo.RecursoBO;
import br.com.devti.gestaorestaurantes.core.entity.RecursoEntity;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class RecursoService {

	public String salvar(RecursoEntity recurso) throws NegocioException {
	    RecursoBO recursoBo = new RecursoBO();
	    return recursoBo.salvar(recurso);
	}
	
	public static List<RecursoEntity> listar() throws NegocioException {
		return RecursoBO.listar();
	}
}
