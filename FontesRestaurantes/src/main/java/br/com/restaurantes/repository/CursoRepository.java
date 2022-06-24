package br.com.restaurantes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.restaurantes.modelo.Produto;

public interface CursoRepository extends JpaRepository<Produto, Long> {

	Produto findByNome(String nome);

}
