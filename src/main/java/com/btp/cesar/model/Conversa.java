package com.btp.cesar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Conversa {
	    @Id
	    @GeneratedValue
        private Long id;
	    private String nome;
	  
	    private String pergunta;
        private String resposta;


	    
	   		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
	    public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
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
		}
