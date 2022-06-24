package br.com.restaurantes.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.com.restaurantes.modelo.Produto;
import br.com.restaurantes.modelo.Mesas;
import br.com.restaurantes.repository.CursoRepository;

public class TopicoForm {

	@NotNull @NotEmpty @Length(min = 5)
	private String titulo;
	
	@NotNull @NotEmpty @Length(min = 10)
	private String mensagem;
	
	@NotNull @NotEmpty
	private String nomeCurso;

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public Mesas converter(CursoRepository cursoRepository) {
		Produto curso = cursoRepository.findByNome(nomeCurso);
		return new Mesas(titulo, mensagem, curso);
	}

}
