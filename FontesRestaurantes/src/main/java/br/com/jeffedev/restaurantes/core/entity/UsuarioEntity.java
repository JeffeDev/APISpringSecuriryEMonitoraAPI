package br.com.jeffedev.restaurantes.core.entity;
import java.io.Serializable;
import java.sql.Time;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.jeffedev.restaurantes.core.entity.herdam.PessoaCore;
import br.com.jeffedev.restaurantes.core.entity.vo.Email;

@Entity
public class UsuarioEntity extends PessoaCore implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private Email email;

	public UsuarioEntity(String celular, String cpf, LocalDate dataNascimento, Time horaNascimento, String cidadeNascimento) {
		super(celular, cpf, dataNascimento, horaNascimento, cidadeNascimento);
	}
	
	public UsuarioEntity() {
	}


	public Long getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}


	public Email getEmail() {
		return email;
	}

}
