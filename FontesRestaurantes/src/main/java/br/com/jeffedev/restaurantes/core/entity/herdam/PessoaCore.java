package br.com.jeffedev.restaurantes.core.entity.herdam;


import java.sql.Time;
import java.time.LocalDate;
import java.util.Objects;

public class PessoaCore {
	private String celular;
	private String cpf;
	private LocalDate dataNascimento;
	private Time horaNascimento;
	private String cidadeNascimento;
	
	public PessoaCore() {
	}

	public PessoaCore(String celular, String cpf, LocalDate dataNascimento, Time horaNascimento, String cidadeNascimento) {
		this.celular = celular;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.horaNascimento = horaNascimento;
		this.cidadeNascimento = cidadeNascimento;
	}

	public String getCelular() {
		return celular;
	}

	public String getCpf() {
		return cpf;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public Time getHoraNascimento() {
		return horaNascimento;
	}

	public String getCidadeNascimento() {
		return cidadeNascimento;
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
	
	
	
	

}
