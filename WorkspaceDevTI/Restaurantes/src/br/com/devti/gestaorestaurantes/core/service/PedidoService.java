package br.com.devti.gestaorestaurantes.core.service;

import java.util.List;

import br.com.devti.gestaorestaurantes.core.bo.PedidoBO;
import br.com.devti.gestaorestaurantes.core.entity.PedidoEntity;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class PedidoService {

	public String salvar(PedidoEntity pedido) throws NegocioException {
		System.out.println("Entrando no backend Pedido, camada service...");
	    PedidoBO pedidoBo = new PedidoBO();
	    return pedidoBo.salvar(pedido);
	}
	
	public List<PedidoEntity> listar() throws NegocioException{
		return PedidoBO.listar();
	}
	
}
