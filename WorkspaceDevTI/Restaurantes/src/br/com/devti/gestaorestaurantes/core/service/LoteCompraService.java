package br.com.devti.gestaorestaurantes.core.service;

import java.util.List;

import br.com.devti.gestaorestaurantes.core.bo.LoteCompraBO;
import br.com.devti.gestaorestaurantes.core.entity.LoteCompraEntity;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class LoteCompraService {
	public String salvarService(LoteCompraEntity loteCompra) throws NegocioException {
		System.out.println("Entrando no backend LoteCompra, camada service...");
	    LoteCompraBO loteCompraBo = new LoteCompraBO();
	    return loteCompraBo.salvar(loteCompra);
	}
	
	public List<LoteCompraEntity> listar() throws NegocioException{
		return LoteCompraBO.listar();
	}
}
