package br.com.vivian.apiMongoCondominiopg.domain;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.bson.types.ObjectId;
import org.hibernate.validator.constraints.br.CNPJ;
import org.springframework.data.annotation.Id;

public class Condominio {
	
	@Id
	private ObjectId _id;

	@NotNull(message = "Nome não pode se nulo")
	@NotEmpty(message = "Nome não pode se vazio")
	private String nome;

	@NotNull(message = "CNPJ não pode ser nulo")
	@NotEmpty(message = "CNPJ não pode ser vazio")
	@CNPJ
	private String cnpj;

	private String contato;
	
	public Condominio() {
		
	}

	public Condominio(ObjectId _id, String nome,String cnpj,	String contato) {
		
		this._id = _id;
		this.nome = nome;
		this.cnpj = cnpj;
		this.contato = contato;
	}

	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}
	
	

}
