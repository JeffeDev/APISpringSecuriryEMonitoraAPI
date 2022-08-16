package br.com.devti.gestaorestaurantes.core.bo;

import java.util.List;

import br.com.devti.gestaorestaurantes.core.dao.FormaPagamentoDAO;
import br.com.devti.gestaorestaurantes.core.entity.FormaPagamentoEntity;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class FormaPagamentoBO {

	public static List<FormaPagamentoEntity> listar() throws NegocioException{
		return FormaPagamentoDAO.listar();
	}

	public String salvar(FormaPagamentoEntity formaPagto) throws NegocioException {
		System.out.println("Camada BO, processando informações FormaPagamento");
		
		if(formaPagto.getTipoPagamento() == null || formaPagto.getTipoPagamento().equals("")) {
			throw new NegocioException("O tipo de pagamento precisa ser preenchido");
		}
		
		FormaPagamentoDAO formaPagamentoDao = new FormaPagamentoDAO();		
		return FormaPagamentoDAO.salvar(formaPagto);
	}

}
