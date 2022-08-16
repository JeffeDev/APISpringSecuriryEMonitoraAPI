package br.com.devti.gestaorestaurantes.core.entity;

import java.io.Serializable;

public class Empresa implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String nomeEmpresa;

	public Empresa() {
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}	

}
