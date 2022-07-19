package br.com.devti.gestaorestaurantes.core.entity.herdam;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class PessoaCore implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String celular;
	private String cpf;
	private Date dtNascimento;
	private String cidadeNascimento;
	
	public PessoaCore() {
	}

	public String getCelular() {
		return celular;
	}

	public String getCpf() {
		return cpf;
	}

	public Date getDataNascimento() {
		return dtNascimento;
	}

	public String getCidadeNascimento() {
		return cidadeNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setCidadeNascimento(String cidadeNascimento) {
		this.cidadeNascimento = cidadeNascimento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PessoaCore other = (PessoaCore) obj;
		return Objects.equals(cpf, other.cpf);
	}
	
	@Override
	public String toString() {
		return "PessoaCore [celular=" + celular + ", cpf=" + cpf + ", dtNascimento=" + dtNascimento
				+ ", cidadeNascimento=" + cidadeNascimento + "]";
	}

}
