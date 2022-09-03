package br.com.devti.gestaorestaurantes.core.bo;

import java.util.List;

import br.com.devti.gestaorestaurantes.core.dao.UsuarioDAO;
import br.com.devti.gestaorestaurantes.core.entity.UsuarioEntity;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class UsuarioBO {

	public String salvarDadosAcesso(UsuarioEntity usuario) throws NegocioException {
		if(usuario.getNome() == null || usuario.getNome().equals("")) {
			throw new NegocioException("O nome do usuário precisa ser preenchido");
		}
		
		// Verificar se Login Já existe em outro usuario, Diferente da Id deste usuario
		
		UsuarioDAO udao = new UsuarioDAO();		
		return udao.salvarDadosAcesso(usuario);
	}

	public String excluir(Long id) throws NegocioException {
		return new UsuarioDAO().excluir(id);
	}

	public String salvarDados(UsuarioEntity usuario) throws NegocioException {
		
		ValidarCamposUsuario(usuario);
		
		UsuarioDAO udao = new UsuarioDAO();		
		return udao.salvarDados(usuario);
		
	}

	public static UsuarioEntity buscaPorId(Long id) throws NegocioException {
		return UsuarioDAO.buscaPorId(id);
	}

	public String alterarDadosCliente(UsuarioEntity usuario) throws NegocioException {
	    UsuarioDAO usuarioDao = new UsuarioDAO();
	    return usuarioDao.alterarDadosCliente(usuario);
	}

	public String salvarDadosCliente(UsuarioEntity usuario) throws NegocioException {
		
		ValidarCamposUsuario(usuario);
		
		UsuarioDAO udao = new UsuarioDAO();		
		return udao.salvarDadosCliente(usuario);
	}

	private void ValidarCamposUsuario(UsuarioEntity usuario) throws NegocioException {
		System.out.println("Camada BO, processando informações");
		
		// TODO Poderia criptografar a senha
		// TODO Poderia validar o restante das informações
		
		if(usuario.getNome() == null || usuario.getNome().equals("")) {
			throw new NegocioException("O nome do usuário precisa ser preenchido");
		}
	}

	public static List<UsuarioEntity> listar() throws NegocioException {
		return UsuarioDAO.listar();
	}

	public static List<UsuarioEntity> listarDadosClientes() throws NegocioException {
		return UsuarioDAO.listarDadosClientes();
	}

}
