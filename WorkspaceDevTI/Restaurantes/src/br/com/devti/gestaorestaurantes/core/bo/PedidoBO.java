package br.com.devti.gestaorestaurantes.core.bo;

import java.util.List;

import br.com.devti.gestaorestaurantes.core.dao.PedidoDAO;
import br.com.devti.gestaorestaurantes.core.entity.PedidoEntity;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class PedidoBO {

	public String salvar(PedidoEntity pedido)throws NegocioException {
		System.out.println("Camada BO, processando informações Pedido");
		
		if(pedido.getDataCompra() == null || pedido.getDataCompra().equals("")) {
			throw new NegocioException("A data da compra precisa ser preenchida");
		}
		
		PedidoDAO pedidoDao = new PedidoDAO();		
		return pedidoDao.salvar(pedido);
	}

	public static List<PedidoEntity> listar() throws NegocioException {
		return PedidoDAO.listar();
	}

}
