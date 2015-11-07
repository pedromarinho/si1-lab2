package models;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//Entidade que representa um Anuncio
//Referenciar a uma tabela
@Entity(name = "Anuncio")
public class Anuncio {

	@Id
	@GeneratedValue
	private Long id;
	private String idDelete, titulo, descricao, instrumentos, estilosQueGosta,
			estilosQueNaoGosta, tipo, email, facebook, endereco, date;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name="ANUNCIO_ID")
	private List<Duvida> duvidas;

	public Anuncio() {
	}

	public Anuncio(String idDelete, String titulo, String descricao,
			String instrumentos, String estilosQueGosta,
			String estilosQueNaoGosta, String tipo, String email,
			String facebook, String endereco, String data) {
		this.idDelete = idDelete;
		this.titulo = titulo;
		this.descricao = descricao;
		this.instrumentos = instrumentos;
		this.estilosQueGosta = estilosQueGosta;
		this.estilosQueNaoGosta = estilosQueNaoGosta;
		this.tipo = tipo;
		this.email = email;
		this.facebook = facebook;
		this.endereco = endereco;
		date = data;
		duvidas = new ArrayList<Duvida>();
	}

	public String getIdDelete() {
		return idDelete;
	}

	public void setIdDelete(String idDelete) {
		this.idDelete = idDelete;
	}

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	@Column(length = 300)
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getInstrumentos() {
		return instrumentos;
	}

	public void setInstrumentos(String instrumentos) {
		this.instrumentos = instrumentos;
	}

	public String getEstilosQueGosta() {
		return estilosQueGosta;
	}

	public void setEstilosQueGosta(String estilosQueGosta) {
		this.estilosQueGosta = estilosQueGosta;
	}

	public String getEstilosQueNaoGosta() {
		return estilosQueNaoGosta;
	}

	public void setEstilosQueNaoGosta(String estilosQueNaoGosta) {
		this.estilosQueNaoGosta = estilosQueNaoGosta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public List<Duvida> getDuvidas() {
		return duvidas;
	}
	
	public void adicionarDuvida(Duvida duvida){
		duvidas.add(duvida);
	}
	
	public void removeDuvida(Duvida duvida){
		duvidas.remove(duvida);
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Anuncio)) {
			return false;
		}
		Anuncio anuncio = (Anuncio) obj;
		return anuncio.getId().equals(this.id);
	}

}
