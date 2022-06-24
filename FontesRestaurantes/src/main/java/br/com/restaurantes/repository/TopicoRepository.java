package br.com.restaurantes.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.restaurantes.modelo.Mesas;

public interface TopicoRepository extends JpaRepository<Mesas, Long> {

	Page<Mesas> findByCursoNome(String nomeCurso, Pageable paginacao);

}
