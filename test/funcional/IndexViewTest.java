package funcional;

import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.contentAsString;
import static play.test.Helpers.contentType;

import java.util.ArrayList;
import java.util.List;

import models.Anuncio;

import org.junit.Before;
import org.junit.Test;


import play.mvc.Content;
import views.html.index;

public class IndexViewTest {

	List<Anuncio> anuncios;
	Anuncio anuncio1;

	@Before
	public void iniciaVariaveis() {
		anuncios = new ArrayList<Anuncio>();
		anuncio1 = new Anuncio("iddelete1", "Anuncio1", "texto de descrição",
				"Violão, Guitarra", "samba, rock", "funk", "ocasional",
				"fulano@gmail.com", "",
				"Av. Aprígio Veloso, 882, Campina Grande", null);
		anuncio1.setId(1L);
	}

	// Testa o template index.scala.html
	@Test
	public void indexTemplate() {
		anuncios.add(anuncio1);

		// guarda o html resultante da renderização do index.scala.html
		// com a lista de anuncios e o formulario
		Content html = index.render(anuncios);
		assertThat(contentType(html)).isEqualTo("text/html");
		// verifica se o html contém a determimnada string, no caso o nome do
		// anuncio
		assertThat(contentAsString(html)).contains(anuncio1.getTitulo());
	}

}
