package br.com.devti.gestaorestaurantes.core.entity;

import java.io.Serializable;
import java.time.LocalDate;

import br.com.devti.gestaorestaurantes.core.entity.herdam.EmpresaCore;

public class Empresa extends EmpresaCore implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String nomeEmpresa;

	public Empresa() {
	}

	public Empresa(String cnpj, String ie, String pessoaResponsavel, String celular, String telefone,
			LocalDate dataAbertura) {
		super(cnpj, ie, pessoaResponsavel, celular, telefone, dataAbertura);
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	

}
