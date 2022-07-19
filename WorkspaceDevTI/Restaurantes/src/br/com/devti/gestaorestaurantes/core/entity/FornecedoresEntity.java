package br.com.devti.gestaorestaurantes.core.entity;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.devti.gestaorestaurantes.core.entity.herdam.EmpresaCore;
import br.com.devti.gestaorestaurantes.core.entity.herdam.EnderecoCore;

public class FornecedoresEntity extends EmpresaCore implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long idFornecedor;
	private String nomeFornecedor;
	private LocalDate dtInicioParceria;
	
	private List<EnderecoCore> endereco = new ArrayList<EnderecoCore>();

	public FornecedoresEntity() {
	}

	public FornecedoresEntity(String nomeFornecedor, LocalDate dtInicioParceria, List<EnderecoCore> endereco) {
		super();
		this.nomeFornecedor = nomeFornecedor;
		this.dtInicioParceria = dtInicioParceria;
		this.endereco = endereco;
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

	public LocalDate getDtInicioParceria() {
		return dtInicioParceria;
	}

	public void setDtInicioParceria(LocalDate dtInicioParceria) {
		this.dtInicioParceria = dtInicioParceria;
	}
	

}
