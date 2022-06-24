package br.com.restaurantes.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "endereco")
public class Endereco {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String cep;
	private String rua;
	private String complemento;
	private String bairro;
	private String cidade;
	private String uf;
	
	@OneToMany(mappedBy ="endereco", fetch = FetchType.EAGER)
	private List<UsuarioEndereco> usuario_endereco = new ArrayList<>();
	
	public Endereco() {
	}
	public Endereco(String cep, String rua, String complemento, String bairro, String cidade, String uf) {
		this.cep = cep;
		this.rua = rua;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
	}
	public Long getId() {
		return id;
	}
	public String getCep() {
		return cep;
	}
	public String getRua() {
		return rua;
	}
	public String getComplemento() {
		return complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public String getUf() {
		return uf;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cep, id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		return Objects.equals(cep, other.cep) && Objects.equals(id, other.id);
	}
	
}
