package br.com.devti.gestaorestaurantes.core.service;

import java.util.List;

import br.com.devti.gestaorestaurantes.core.bo.UsuarioBO;
import br.com.devti.gestaorestaurantes.core.entity.UsuarioEntity;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class UsuarioService {

	public String salvarDadosAcesso(UsuarioEntity usuario) throws NegocioException {
		System.out.println("Entrando no backend, camada service Salvar Dados de Acesso...");
	    UsuarioBO usuarioBo = new UsuarioBO();
	    return usuarioBo.salvarDadosAcesso(usuario);
	}
	public String alterarDadosCliente(UsuarioEntity usuario) throws NegocioException {
	    UsuarioBO usuarioBo = new UsuarioBO();
	    return usuarioBo.alterarDadosCliente(usuario);
	}
	
	public UsuarioEntity buscaPorId(long id) throws NegocioException{
		return UsuarioBO.buscaPorId(id);
	}
	
	public String excluir(Long Id) throws NegocioException {
		return new UsuarioBO().excluir(Id);
	}
	public String salvarDadosCliente(UsuarioEntity usuario) throws NegocioException {
		System.out.println("Entrando no backend, camada service Salvar Novo Cliente...");
	    UsuarioBO usuarioBo = new UsuarioBO();
	    return usuarioBo.salvarDadosCliente(usuario);
	}
	
	public List<UsuarioEntity> listar() throws NegocioException{
		return UsuarioBO.listar();
	}
	
	public List<UsuarioEntity> listarDadosClientes() throws NegocioException {
		return UsuarioBO.listarDadosClientes();
	}
}
