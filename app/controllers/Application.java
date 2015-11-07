package controllers;

import java.text.DateFormat;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import models.Anuncio;
import models.Duvida;
import models.dao.GenericDAO;
import play.Logger;
import play.data.DynamicForm;
import play.data.Form;
import play.db.jpa.Transactional;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {
	// static List<Anuncio> anuncios = new ArrayList();
	private static final GenericDAO dao = new GenericDAO();
	private static Integer contAnuncios = 15;

	// static List<Anuncio> anuncios = dao.findAllByClass(Anuncio.class);

	@Transactional
	public static Result index() {
		// povoaBd(25);
//		 apagaBd();
		return ok(index.render(contAnuncios, dao.findAllByClass(Anuncio.class)));

	}

	@Transactional
	public static void apagaBd() {
		List<Anuncio> anuncios = dao.findAllByClass(Anuncio.class);
		for (Anuncio anuncio : anuncios) {
			dao.remove(anuncio);
		}
	}

	@Transactional
	public static void povoaBd(int anuncios) {
		Calendar c = Calendar.getInstance();
		c.set(2015, 5, 10);
		String tipo = "Tocar em banda";
		for (int i = 0; i <= anuncios; i++) {
			dao.persist(new Anuncio("iddelete" + i, "Anuncio" + i,
					"texto de descrição", "Violão, Guitarra", "samba, rock",
					"funk", tipo, "fulano@gmail.com", "",
					"Av. Aprígio Veloso, 882, Campina Grande", DateFormat
							.getDateInstance(DateFormat.LONG).format(
									c.getTime())));
			if ((i % 2) == 0) {
				c.add(Calendar.DAY_OF_MONTH, 1);
				tipo = "Tocar ocasionalmente";
			} else {
				tipo = "Tocar em banda";
			}

		}
	}

	@Transactional
	public static Anuncio getAnuncio(String idDelete) {
		List<Anuncio> anuncio = dao.findByAttributeName("Anuncio", "idDelete",
				idDelete);
		if (anuncio.size() > 0) {
			return anuncio.get(0);
		}
		return null;
	}

	@Transactional
	public static Anuncio getAnuncio(long id) {
		List<Anuncio> anuncio = dao.findByAttributeName("Anuncio", "id", id);
		if (anuncio.size() > 0) {
			return anuncio.get(0);
		}
		return null;
	}
	
	@Transactional
	public static Duvida getDuvida(long id) {
		List<Duvida> duvida = dao.findByAttributeName("Duvida", "id", id);
		if (duvida.size() > 0) {
			return duvida.get(0);
		}
		return null;
	}

	@Transactional
	public static Result deletarAnuncio(long id) {
		DynamicForm dynamicForm = Form.form().bindFromRequest();
		List<Anuncio> anuncios = dao.findAllByClass(Anuncio.class);

		Anuncio a = getAnuncio(id);
		
		System.out.println("id delete: " + a.getIdDelete());
		System.out.println("form: " + dynamicForm.get("idDelete"));

		if (dynamicForm.get("idDelete").equals(a.getIdDelete())) {
			
			dao.remove(a);
			dao.flush();
			if(dynamicForm.get("help").equals("sim")){
				contAnuncios++;
			}
			
			return index();

		
		}
		return ok(showanuncio.render("Código incorreto!", a));

	}

	@Transactional
	public static Result showAnuncio(Long id) {
		return ok(showanuncio.render("", getAnuncio(id)));
	}

	@Transactional
	public static Result buscar() {
		DynamicForm dynamicForm = Form.form().bindFromRequest();
		String[] keys = dynamicForm.get("key").split("\\s*,\\s*");
		String banda = dynamicForm.get("banda");
		String ocasional = dynamicForm.get("ocasional");

		List<Anuncio> search = new ArrayList();
		List<Anuncio> anuncios = dao.findAllByClass(Anuncio.class);
		for (Anuncio anuncio : anuncios) {
			for (String key : keys) {
				boolean estaNoAnuncio = false;
				if (key.length() > 0) {
					Logger.info("key: " + key);
					if (banda != null) {
						if (encontraOcorrencia(key, anuncio)
								&& anuncio.getTipo().equals(banda)) {
							estaNoAnuncio = true;
						} else {
							break;
						}
					}
					if (ocasional != null) {
						if (encontraOcorrencia(key, anuncio)
								&& anuncio.getTipo().equals(ocasional)) {
							estaNoAnuncio = true;
						} else {
							break;
						}
					} else {
						if (encontraOcorrencia(key, anuncio)) {
							estaNoAnuncio = true;
						} else {
							break;
						}
					}
				} else {
					Logger.info("key: " + key);
					Logger.info("banda: " + banda);
					Logger.info("ocasional: " + ocasional);
					if (banda != null) {
						if (anuncio.getTipo().equals(banda)) {
							Logger.info("tipo: " + anuncio.getTipo());
							estaNoAnuncio = true;
						} else {
							break;
						}
					}
					if (ocasional != null) {
						if (anuncio.getTipo().equals(ocasional)) {
							estaNoAnuncio = true;
						} else {
							break;
						}
					}
				}
				if (estaNoAnuncio) {
					search.add(anuncio);
				}

			}

		}
		Logger.info("lista criada: " + search.size());
		return ok(index.render(contAnuncios, search));
	}

	public static Result formularioNovoAnuncio() {
		Form<Anuncio> form = Form.form(Anuncio.class);
		return ok(formulario.render("", form));
	}
	
	@Transactional
	public static Result adicionarPergunta(long id){
		DynamicForm dynamicForm = Form.form().bindFromRequest();
		Anuncio anuncio = getAnuncio(id);
		anuncio.adicionarDuvida(new Duvida(dynamicForm.get("pergunta")));
		System.out.println("adicionaPergunta() " + id);
		dao.merge(anuncio);
//		Duvida d = getDuvida(id);
		
		return showAnuncio(anuncio.getId());
		
	}
	
	@Transactional
	public static Result adicionarResposta(long anuncioId, long duvidaId){
		DynamicForm dynamicForm = Form.form().bindFromRequest();
		
//		Duvida d = new Duvida(duvida.getPergunta(), dynamicForm.get("resposta"));
//		Anuncio anuncio = getAnuncio(id);
//		Duvida d = anuncio.getDuvidas().get(index);
//		d.setResposta(dynamicForm.get("resposta"));
//		anuncio.removeDuvida(anuncio.getDuvidas().get(index));
//		anuncio.adicionarDuvida(d);
//		dao.merge(anuncio);
		
		Duvida d = getDuvida(duvidaId);
		d.setResposta(dynamicForm.get("resposta"));
		dao.merge(d);
		
		return showAnuncio(anuncioId);
		
	}

	@Transactional
	public static Result novoAnuncio() {
		DynamicForm dynamicForm = Form.form().bindFromRequest();
		Form<Anuncio> form = Form.form(Anuncio.class).bindFromRequest();
		if (form.hasErrors()) {
			return badRequest(formulario.render("Dados inválidos", form));
		}
		if (getAnuncio(dynamicForm.get("idDelete")) != null) {
			return ok(formulario.render(
					"O identificador inserido já foi cadastrado", form));
		}

		// seta todos os valores a partir dos forms
		Anuncio anuncio = form.get();

		anuncio.setDate(DateFormat.getDateInstance(DateFormat.LONG).format(
				Calendar.getInstance().getTime()));

		dao.persist(anuncio);
		// Espelha no Banco de Dados
		dao.flush();

		return redirect(routes.Application.index());
	}

	public static boolean keyInText(String key, String text) {
		String textNormalizer = Normalizer.normalize(text, Normalizer.Form.NFD)
				.replaceAll("[^\\p{ASCII}]", "").toLowerCase();
		String keyNormalizer = Normalizer.normalize(key, Normalizer.Form.NFD)
				.replaceAll("[^\\p{ASCII}]", "").toLowerCase();
		if (textNormalizer.contains(keyNormalizer)) {
			return true;
		}
		return false;
	}

	public static boolean encontraOcorrencia(String key, Anuncio anuncio) {
		if (keyInText(key, anuncio.getTitulo())
				|| keyInText(key, anuncio.getDescricao())
				|| keyInText(key, anuncio.getInstrumentos())
				|| keyInText(key, anuncio.getEstilosQueGosta())
				|| keyInText(key, anuncio.getEndereco())) {
			return true;
		}
		return false;
	}

}
