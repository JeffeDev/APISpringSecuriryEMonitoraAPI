package br.com.devti.gestaorestaurantes.core.entity.herdam;


import java.io.Serializable;
import java.util.Objects;

public class EnderecoCore implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long enderecoId;
	
	private String cep;
	private String rua;
	private String bairro;
	private String cidade;
	private String estado;
	private String pais;
	
	public EnderecoCore(String cep, String rua, String bairro, String cidade, String estado, String pais) {
		this.cep = cep;
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
	}

	public EnderecoCore() {
	}

	public String getCep() {
		return cep;
	}

	public String getRua() {
		return rua;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

	public String getPais() {
		return pais;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cep);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EnderecoCore other = (EnderecoCore) obj;
		return Objects.equals(cep, other.cep);
	}

	public Long getEnderecoId() {
		return enderecoId;
	}

	public void setEnderecoId(Long enderecoId) {
		this.enderecoId = enderecoId;
	}
	
	
}
