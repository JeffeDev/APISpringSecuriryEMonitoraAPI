package br.com.devti.gestaorestaurantes.core.bo;

import java.util.List;

import br.com.devti.gestaorestaurantes.core.dao.LoteCompraDAO;
import br.com.devti.gestaorestaurantes.core.entity.LoteCompraEntity;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class LoteCompraBO {

	public String salvar(LoteCompraEntity loteCompra) throws NegocioException {
		System.out.println("Camada BO, processando informações LoteCompra");
		
		if(loteCompra.getNumeroLote() == null || loteCompra.getNumeroLote().equals("")) {
			throw new NegocioException("O número do Lote não pode ser deixado em branco");
		}
		
		LoteCompraDAO loteCompraDao = new LoteCompraDAO();		
		return loteCompraDao.salvar(loteCompra);
	}

	public static List<LoteCompraEntity> listar() throws NegocioException {
		return LoteCompraDAO.listar();
	}

}
