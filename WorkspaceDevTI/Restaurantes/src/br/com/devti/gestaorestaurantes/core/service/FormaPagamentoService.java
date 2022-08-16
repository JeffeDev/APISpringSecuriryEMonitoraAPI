package br.com.devti.gestaorestaurantes.core.service;

import java.util.List;

import br.com.devti.gestaorestaurantes.core.bo.FormaPagamentoBO;
import br.com.devti.gestaorestaurantes.core.entity.FormaPagamentoEntity;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class FormaPagamentoService {
	public String salvarFormaPagto(FormaPagamentoEntity formaPagto) throws NegocioException {
		System.out.println("Entrando no backend, camada service...");
		
		FormaPagamentoBO bo = new FormaPagamentoBO();
	    return bo.salvar(formaPagto);
	}
	public List<FormaPagamentoEntity> listar() throws NegocioException{
		FormaPagamentoBO formaPagamentoBo;
		return FormaPagamentoBO.listar();
	}
}
