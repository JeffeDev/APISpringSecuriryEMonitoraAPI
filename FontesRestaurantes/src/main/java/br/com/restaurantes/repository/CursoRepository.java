package br.com.restaurantes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.restaurantes.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nome);

}
