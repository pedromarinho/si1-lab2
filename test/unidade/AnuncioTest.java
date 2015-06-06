package unidade;

import static org.fest.assertions.Assertions.assertThat;

import java.util.List;

import models.Anuncio;
import models.dao.GenericDAO;

import org.junit.Test;

import base.AbstractTest;

public class AnuncioTest extends AbstractTest {

	GenericDAO dao = new GenericDAO();
	List<Anuncio> anuncios;

	@Test
	public void salvarAnuncio() {
		anuncios = dao.findAllByClass(Anuncio.class); // consulta o bd
		assertThat(anuncios.size()).isEqualTo(0);

		Anuncio a1 = new Anuncio("iddelete1", "Anuncio1", "texto de descrição",
				"Violão, Guitarra", "samba, rock", "funk", "ocasional",
				"fulano@gmail.com", "",
				"Av. Aprígio Veloso, 882, Campina Grande", null);
		dao.persist(a1);

		anuncios = dao.findAllByClass(Anuncio.class); // consulta o bd
		assertThat(anuncios.size()).isEqualTo(1);
		assertThat(anuncios.get(0).getTitulo()).isEqualTo("Anuncio1");
	}

}
