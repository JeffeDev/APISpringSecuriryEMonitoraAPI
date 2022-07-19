package br.com.devti.gestaorestaurantes.core.entity.herdam;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class EmpresaCore implements Serializable{
	private static final long serialVersionUID = 1L;
	private String cnpj;
	private String ie;
	private String pessoaResponsavel;
	private String celular;
	private String telefone;
	private LocalDate dtAbertura;
	
	
	public EmpresaCore() {
	}

	public EmpresaCore(String cnpj, String ie, String pessoaResponsavel, String celular, String telefone,
			LocalDate dataAbertura) {
		this.cnpj = cnpj;
		this.ie = ie;
		this.pessoaResponsavel = pessoaResponsavel;
		this.celular = celular;
		this.telefone = telefone;
		this.dtAbertura = dataAbertura;
	}

	public String getCnpj() {
		return cnpj;
	}

	public String getIe() {
		return ie;
	}

	public String getPessoaResponsavel() {
		return pessoaResponsavel;
	}

	public String getCelular() {
		return celular;
	}

	public String getTelefone() {
		return telefone;
	}

	public LocalDate getDataAbertura() {
		return dtAbertura;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cnpj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpresaCore other = (EmpresaCore) obj;
		return Objects.equals(cnpj, other.cnpj);
	}
	
	
	
}
