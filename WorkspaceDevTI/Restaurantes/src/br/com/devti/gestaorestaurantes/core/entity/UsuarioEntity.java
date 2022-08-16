package br.com.devti.gestaorestaurantes.core.entity;

import java.io.Serializable;
import java.util.Objects;

public class UsuarioEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String nome;
	private String login;
	private String senha;
	private String email;

	private Long  idGrupoUsuario;
	private String cpf;
	private String dataNascimento;
	private String celular;
	private String telefone;
	private String cep;
	private String endereco;
	private String numero;
	private String bairro;
	private String complemento;
	private String cidade;
	private String estado;	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
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

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public UsuarioEntity() {
	}
	
	public UsuarioEntity(String nome, String login, String senha, String email) {
		super();
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.email = email;
	}
	public UsuarioEntity(Long idGrupoUsuario, String cpf,
			String dataNascimento, String celular, String telefone, String cep, String endereco, String numero,
			String bairro, String complemento, String cidade, String estado) {
		super();
		this.idGrupoUsuario = idGrupoUsuario;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.celular = celular;
		this.telefone = telefone;
		this.cep = cep;
		this.endereco = endereco;
		this.numero = numero;
		this.bairro = bairro;
		this.complemento = complemento;
		this.cidade = cidade;
		this.estado = estado;
	}
	public UsuarioEntity(String nome, String login, String senha, String email,
			Long idGrupoUsuario, String cpf,
			String dataNascimento, String celular, String telefone, String cep, String endereco, String numero,
			String bairro, String complemento, String cidade, String estado) {
		super();
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.email = email;
		this.idGrupoUsuario = idGrupoUsuario;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.celular = celular;
		this.telefone = telefone;
		this.cep = cep;
		this.endereco = endereco;
		this.numero = numero;
		this.bairro = bairro;
		this.complemento = complemento;
		this.cidade = cidade;
		this.estado = estado;
	}
	public UsuarioEntity(Long id, String nome, String login, String senha, String email,
			String estado) {
		super();
		this.id = id;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.email = email;
		this.idGrupoUsuario = idGrupoUsuario;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.celular = celular;
		this.telefone = telefone;
		this.cep = cep;
		this.endereco = endereco;
		this.numero = numero;
		this.bairro = bairro;
		this.complemento = complemento;
		this.cidade = cidade;
		this.estado = estado;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
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
		return Objects.equals(id, other.id);
	}

}