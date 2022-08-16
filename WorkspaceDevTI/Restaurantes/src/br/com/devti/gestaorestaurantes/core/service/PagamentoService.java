package br.com.devti.gestaorestaurantes.core.service;

import java.util.List;

import br.com.devti.gestaorestaurantes.core.bo.PagamentoBO;
import br.com.devti.gestaorestaurantes.core.entity.PagamentoEntity;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class PagamentoService {
	public String salvar(PagamentoEntity pagamento) throws NegocioException {
		System.out.println("Entrando no backend Pagamento, camada service...");
	    PagamentoBO pagamentoBo = new PagamentoBO();
	    return pagamentoBo.salvar(pagamento);
	}
	
	public List<PagamentoEntity> listar() throws NegocioException{
		return PagamentoBO.listar();
	}
}
