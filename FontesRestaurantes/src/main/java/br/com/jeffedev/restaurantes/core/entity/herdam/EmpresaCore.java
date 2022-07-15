package br.com.jeffedev.restaurantes.core.entity.herdam;


import java.time.LocalDate;
import java.util.Objects;

public class EmpresaCore {
	private String cnpj;
	private String ie;
	private String pessoaResponsavel;
	private String celular;
	private String telefone;
	private LocalDate dataAbertura;
	private LocalDate dataInicioParceria;
	
	public EmpresaCore() {
	}

	public EmpresaCore(String cnpj, String ie, String pessoaResponsavel, String celular, String telefone,
			LocalDate dataAbertura, LocalDate dataInicioParceria) {
		this.cnpj = cnpj;
		this.ie = ie;
		this.pessoaResponsavel = pessoaResponsavel;
		this.celular = celular;
		this.telefone = telefone;
		this.dataAbertura = dataAbertura;
		this.dataInicioParceria = dataInicioParceria;
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
		return dataAbertura;
	}

	public LocalDate getDataInicioParceria() {
		return dataInicioParceria;
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
