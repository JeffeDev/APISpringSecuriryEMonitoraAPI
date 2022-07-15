package br.com.jeffedev.restaurantes.core.entity;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.jeffedev.restaurantes.core.entity.herdam.EmpresaCore;
import br.com.jeffedev.restaurantes.core.entity.herdam.EnderecoCore;

@Entity
public class FornecedoresEntity extends EmpresaCore implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFornecedor;
	private String nomeFornecedor;
	
	private List<EnderecoCore> endereco = new ArrayList<EnderecoCore>();

	public FornecedoresEntity() {
	}

	public FornecedoresEntity(String cnpj, String ie, String pessoaResponsavel, String celular, String telefone,
			LocalDate dataAbertura, LocalDate dataInicioParceria) {
		super(cnpj, ie, pessoaResponsavel, celular, telefone, dataAbertura, dataInicioParceria);
	}

	public Long getIdFornecedor() {
		return idFornecedor;
	}

	public String getNomeFornecedor() {
		return nomeFornecedor;
	}

	public List<EnderecoCore> getEndereco() {
		return endereco;
	}
	

}
