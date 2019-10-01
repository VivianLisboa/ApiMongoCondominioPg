package br.com.vivian.apiMongoCondominiopg.domain;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "CtaPagar")
public class CtaPagar {

	@Id
	private ObjectId _id;

	@NotNull
	@NotEmpty
	private Condominio condominio;

	private String data;
	private String historico;
	private Double debito;
	private Double credito;
	private Double saldo;

	private String observacao;
	private String docValido;
	private String comprovPgto;
	private String pendente;

	public CtaPagar() {

	}

	public CtaPagar(ObjectId _id, Condominio condominio, String data, String historico, Double debito, Double credito,
			Double saldo) {

		this._id = _id;
		this.condominio = condominio;
		this.data = data;
		this.historico = historico;
		this.debito = debito;
		this.credito = credito;
		this.saldo = saldo;
	}

	public CtaPagar(ObjectId _id, Condominio condominio, String data, String historico, Double debito, Double credito,
			Double saldo, String observacao, String docValido, String comprovPgto, String pendente) {

		this(_id, condominio, data, historico, debito, credito, saldo);
		this.observacao = observacao;
		this.docValido = docValido;
		this.comprovPgto = comprovPgto;
		this.pendente = pendente;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getDocValido() {
		return docValido;
	}

	public void setDocValido(String docValido) {
		this.docValido = docValido;
	}

	public String getComprovPgto() {
		return comprovPgto;
	}

	public void setComprovPgto(String comprovPgto) {
		this.comprovPgto = comprovPgto;
	}

	public String getPendente() {
		return pendente;
	}

	public void setPendente(String pendente) {
		this.pendente = pendente;
	}

	public ObjectId get_id() {
		return _id;
	}

	public Condominio getCondominio() {
		return condominio;
	}

	public String getData() {
		return data;
	}

	public String getHistorico() {
		return historico;
	}

	public Double getDebito() {
		return debito;
	}

	public Double getCredito() {
		return credito;
	}

	public Double getSaldo() {
		return saldo;
	}

}
