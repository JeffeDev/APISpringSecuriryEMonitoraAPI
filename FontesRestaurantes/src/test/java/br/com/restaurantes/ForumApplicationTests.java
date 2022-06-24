package br.com.restaurantes;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.restaurantes.modelo.Produto;
import br.com.restaurantes.repository.CursoRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
@ActiveProfiles("test")
public class ForumApplicationTests {
	@Autowired
	private CursoRepository repository;

	@Autowired
	private TestEntityManager em;

	@Test
	public void testarCarregamentoFindByNomeCurso() {
		String nomeCurso = "HTML 5 TESTE";

		Produto html5 = new Produto();
		html5.setNome(nomeCurso);
		html5.setCategoria("Programacao");
		em.persist(html5);

		Produto curso = repository.findByNome(nomeCurso);

		Assert.assertNotNull(curso);
		Assert.assertEquals(nomeCurso, curso.getNome());
	}

}
