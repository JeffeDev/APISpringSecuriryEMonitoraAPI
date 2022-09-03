package br.com.devti.gestaorestaurantes.core.entity;

import java.io.Serializable;
import java.util.Objects;

public class FornecedoresEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String razao;
	private String cnpj;
	private String email;
	private String celular;
	private String telefone;
	private String dataAbertura;
	private String endereco;
	private String numero;
	private String bairro;
	private String cep;
	private String cidade;
	private String complemento;
	private String estado;	
	private String gps;
	private String obs;
	
	@Override
	public String toString() {
		return "UsuarioEntity [id=" + id + ", razao=" + razao + ", email="
				+ email + ", cnpj=" + cnpj + ", dataAbertura=" + dataAbertura + ", celular=" + celular + ", telefone="
				+ telefone + ", cep=" + cep + ", endereco=" + endereco + ", numero=" + numero + ", bairro=" + bairro
				+ ", complemento=" + complemento + ", cidade=" + cidade + ", estado=" + estado + ", obs=" + obs
				+ ", gps=" + gps + "]";
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getRazao() {
		return razao;
	}
	public void setRazao(String Razao) {
		this.razao = Razao;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
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
	
	public FornecedoresEntity() {
	}
	
	public FornecedoresEntity(String cnpj,
			String dataAbertura, String celular, String telefone, String cep, String endereco, String numero,
			String bairro, String complemento, String cidade, String estado) {
		super();
		this.cnpj = cnpj;
		this.dataAbertura = dataAbertura;
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
	public FornecedoresEntity(String Razao, String login, String senha, String email,
			Long idGrupoUsuario, String cnpj,
			String dataAbertura, String celular, String telefone, String cep, String endereco, String numero,
			String bairro, String complemento, String cidade, String estado) {
		super();
		this.razao = Razao;
		this.email = email;
		this.cnpj = cnpj;
		this.dataAbertura = dataAbertura;
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
		FornecedoresEntity other = (FornecedoresEntity) obj;
		return Objects.equals(id, other.id);
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getGps() {
		return gps;
	}

	public void setGps(String gps) {
		this.gps = gps;
	}

}