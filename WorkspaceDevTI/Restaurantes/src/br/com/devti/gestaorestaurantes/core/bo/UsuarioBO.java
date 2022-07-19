package br.com.devti.gestaorestaurantes.core.bo;

import java.util.List;

import br.com.devti.gestaorestaurantes.core.dao.UsuarioDAO;
import br.com.devti.gestaorestaurantes.core.entity.UsuarioEntity;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class UsuarioBO {

	public String salvarUsuario(UsuarioEntity usuario) throws NegocioException {
		System.out.println("Camada BO, processando informações");
		
		// TODO Poderia criptografar a senha
		// TODO Poderia validar o restante das informações
		
		if(usuario.getNome() == null || usuario.getNome().equals("")) {
			throw new NegocioException("O nome do usuário precisa ser preenchido");
		}
		
		UsuarioDAO udao = new UsuarioDAO();		
		return udao.salvarUsuario(usuario);
	}

	public static List<UsuarioEntity> listarUsuario() throws NegocioException {
		return UsuarioDAO.listarUsuario();
	}
	
}