package br.com.devti.gestaorestaurantes.core.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import br.com.devti.gestaorestaurantes.core.entity.herdam.PessoaCore;
import br.com.devti.gestaorestaurantes.core.entity.herdam.UsuarioEnderecoCore;

public class UsuarioEntity extends PessoaCore implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long idUsuario;
	private String nome;
	private String login;
	private String senha;
	private String email;
	private PessoaCore dadosPessoais;
	private List<UsuarioEnderecoCore> enderecosCadastrados = new ArrayList<>();
	
	public UsuarioEntity() {
		dadosPessoais = new PessoaCore();
	}
	
	public Date getDtNascimento() {
		return dadosPessoais.getDataNascimento();
	}
	public void setDtNascimento(Date dtNascimento) {
		dadosPessoais.setDtNascimento(dtNascimento);
	}
	public Long getCodigo() {
		return idUsuario;
	}
	public void setCodigo(Long codigo) {
		this.idUsuario = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return dadosPessoais.getCelular();
	}
	public String getCpf() {
		return dadosPessoais.getCpf();
	}
	public String getCidadeNascimento() {
		return dadosPessoais.getCidadeNascimento();
	}

	public void setCelular(String celular) {
		dadosPessoais.setCelular(celular);
	}

	public void setCpf(String cpf) {
		dadosPessoais.setCpf(cpf);
	}

	public void setCidadeNascimento(String cidadeNascimento) {
		dadosPessoais.setCidadeNascimento(cidadeNascimento);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(idUsuario);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioEntity other = (UsuarioEntity) obj;
		return Objects.equals(idUsuario, other.idUsuario);
	}
	public List<UsuarioEnderecoCore> getEnderecosCadastrados() {
		return enderecosCadastrados;
	}
	public void setEnderecosCadastrados(List<UsuarioEnderecoCore> enderecosCadastrados) {
		this.enderecosCadastrados = enderecosCadastrados;
	}
	@Override
	public String toString() {
		return "UsuarioEntity [idUsuario=" + idUsuario + ", nome=" + nome + ", login=" + login + ", senha=" + senha
				+ ", email=" + email + ", dadosPessoais=" + dadosPessoais + "]";
	}
		
}
