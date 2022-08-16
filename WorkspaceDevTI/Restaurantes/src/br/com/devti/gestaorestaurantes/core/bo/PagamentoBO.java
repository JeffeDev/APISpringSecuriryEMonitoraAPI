package br.com.devti.gestaorestaurantes.core.bo;

import java.util.List;

import br.com.devti.gestaorestaurantes.core.dao.PagamentoDAO;
import br.com.devti.gestaorestaurantes.core.entity.PagamentoEntity;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class PagamentoBO {

	public String salvar(PagamentoEntity pagamento) throws NegocioException {
		System.out.println("Camada BO, processando informações Pagamento");
		
		if(pagamento.getDataPagto() == null || pagamento.getDataPagto().equals("")) {
			throw new NegocioException("A data do pagto precisa ser preenchida");
		}
		
		PagamentoDAO pagamentoDao = new PagamentoDAO();		
		return pagamentoDao.salvar(pagamento);
	}

	public static List<PagamentoEntity> listar() throws NegocioException {
		return PagamentoDAO.listar();
	}
}
