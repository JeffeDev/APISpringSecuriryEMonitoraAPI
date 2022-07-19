package br.com.devti.gestaorestaurantes.core.bo;

import br.com.devti.gestaorestaurantes.core.dao.GrupoUsuarioDAO;
import br.com.devti.gestaorestaurantes.core.entity.GrupoUsuarioEntity;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class GrupoUsuarioBO {

	public String salvarGrupoUsuario(GrupoUsuarioEntity grupoUsuario) throws NegocioException {
		System.out.println("Camada BO, processando informações GrupoUsuarios");
		
		if(grupoUsuario.getNomeGrupo() == null || grupoUsuario.getNomeGrupo().equals("")) {
			throw new NegocioException("O nome do grupo precisa ser preenchido");
		}
		
		GrupoUsuarioDAO grUsuariodao = new GrupoUsuarioDAO();		
		return grUsuariodao.salvarUsuario(grupoUsuario);
	}

}
