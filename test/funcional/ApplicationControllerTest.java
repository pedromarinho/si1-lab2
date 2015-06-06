package funcional;

import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.callAction;
import static play.test.Helpers.charset;
import static play.test.Helpers.contentAsString;
import static play.test.Helpers.fakeRequest;
import static play.test.Helpers.redirectLocation;
import static play.test.Helpers.status;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;

import models.Anuncio;

import models.dao.GenericDAO;

import org.junit.Test;

import play.mvc.Http;
import play.mvc.Result;
import base.AbstractTest;

public class ApplicationControllerTest extends AbstractTest {

	Result result;
	EntityManager em;
	
	@Test
	public void callIndex() {
		// realiza a chamada ao método index() do Application
		result = callAction(controllers.routes.ref.Application.index(),
				fakeRequest());
		
		assertThat(status(result)).isEqualTo(Http.Status.SEE_OTHER);
		//assertThat(redirectLocation(result)).isEqualTo("/books");
	}
	
	@Test
	public void callAnuncios() {
		// realiza a chamada ao método books() do Application
		result = callAction(controllers.routes.ref.Application.index(),
				fakeRequest());
		// ao chamar o método index do Application, ele retora o html
		// correspondente.
		assertThat(status(result)).isEqualTo(Http.Status.OK);
		assertThat(charset(result)).isEqualTo("utf-8");
		assertThat(contentAsString(result)).contains("0 livro(s)");
	}
	
	@Test
	public void callNewAnuncio() {
		// Mapa com os dados do formulario para criação do livro
		Map<String, String> formData = new HashMap<String, String>();
		formData.put("identificador", "Anuncio1");
		
		// realiza a chamada ao método novoAnuncio() do Application com o
		// formulário.
		result = callAction(
				controllers.routes.ref.Application.novoAnuncio(), fakeRequest()
						.withFormUrlEncodedBody(formData));
		
		// ao chamar o método novoAnuncio() do Application, ele adiciona o livro e
		// redireciona para a url '/anuncio/novo'
		assertThat(status(result)).isEqualTo(Http.Status.SEE_OTHER);
		assertThat(redirectLocation(result)).isEqualTo("/anuncio/novo");

		// testa se realmente adicionou o anuncio com nome "Anuncio1" no banco de
		// dados.
        GenericDAO dao = new GenericDAO();
		List<Anuncio> anuncios = dao.findAllByClass(Anuncio.class);
		assertThat(anuncios.size()).isEqualTo(1);
        assertThat(anuncios.get(0).getTitulo()).isEqualTo("Anuncio1");
		List<Anuncio> result2 = dao.findByAttributeName("Anuncio", 
				"titulo", "Anuncio1");	
		assertThat(result2.size()).isEqualTo(1);
		
//		// verifica o html gerado pela url '/books' que é chamada dentro do newBook
//		result = callAction(controllers.routes.ref.Application.books(),
//				fakeRequest());
//		assertThat(status(result)).isEqualTo(Http.Status.OK);
//		assertThat(contentAsString(result)).contains("1 livro(s)");
	}
}