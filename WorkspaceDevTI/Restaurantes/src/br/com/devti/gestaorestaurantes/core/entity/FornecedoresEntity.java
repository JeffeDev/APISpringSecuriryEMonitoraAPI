package br.com.devti.gestaorestaurantes.core.entity;


import java.io.Serializable;

public class FornecedoresEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nomeFornecedor;
	private String dtInicioParceria;
	
	public FornecedoresEntity() {
	}

	public Long getId() {
		return id;
	}

	public String getNomeFornecedor() {
		return nomeFornecedor;
	}

	public String getDtInicioParceria() {
		return dtInicioParceria;
	}
	

	public void setId(Long idFornecedor) {
		this.id = idFornecedor;
	}

	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}

	public void setDtInicioParceria(String data) {
		this.dtInicioParceria = data;
	}
	
}
