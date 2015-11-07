package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Duvida")
public class Duvida {
	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String pergunta;
	@Column
	private String resposta;
	
	public Duvida(){}
	
	public Duvida(String pergunta, String resposta){
		this.pergunta = pergunta;
		this.resposta = resposta;
	}
	
	public Duvida(String pergunta){
		this.pergunta = pergunta;
		resposta = "";
	}

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	public Long getId() {
		return id;
	}
	
	
}
