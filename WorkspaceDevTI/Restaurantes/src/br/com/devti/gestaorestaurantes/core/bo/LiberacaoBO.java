package br.com.devti.gestaorestaurantes.core.bo;

import java.util.List;

import br.com.devti.gestaorestaurantes.core.dao.LiberacaoDAO;
import br.com.devti.gestaorestaurantes.core.entity.LiberacaoUsuarioEntity;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class LiberacaoBO {

	public String salvar(LiberacaoUsuarioEntity liberacaoUsuario) throws NegocioException {
		System.out.println("Camada BO, processando informações LiberacaoUsuario");
		
		LiberacaoDAO liberacaoDao = new LiberacaoDAO();		
		return liberacaoDao.salvar(liberacaoUsuario);
	}

	public static List<LiberacaoUsuarioEntity> listar() throws NegocioException {
		return LiberacaoDAO.listar();
	}
	
}
