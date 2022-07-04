package br.com.restaurantes.modelo;

import java.sql.Time;
import java.time.LocalDate;

public class Pessoa {
	private String celular;
	private String cpf;
	private LocalDate dataNascimento;
	private Time horaNascimento;
	private String cidadeNasceuUF; // Formatação Cidade-UF
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Time getHoraNascimento() {
		return horaNascimento;
	}
	public void setHoraNascimento(Time horaNascimento) {
		this.horaNascimento = horaNascimento;
	}
	public String getCidadeNasceuUF() {
		return cidadeNasceuUF;
	}
	public void setCidadeNasceuUF(String cidadeNasceuUF) {
		this.cidadeNasceuUF = cidadeNasceuUF;
	}

}
