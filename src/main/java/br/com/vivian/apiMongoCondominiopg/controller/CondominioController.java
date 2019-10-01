package br.com.vivian.apiMongoCondominiopg.controller;

import java.util.List;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.vivian.apiMongoCondominiopg.domain.Condominio;
import br.com.vivian.apiMongoCondominiopg.repository.CondominioRepository;

@RestController
@RequestMapping(value = "/condominiopg")
public class CondominioController {

	@Autowired

	private CondominioRepository condominioRepository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Condominio> getCondominio() {
		return condominioRepository.findAll();
	}

	@RequestMapping(value = "/{_id}", method = RequestMethod.GET)
	public Condominio getCondominiosById(@PathVariable("_id") ObjectId _id) {

		return condominioRepository.findBy_id(_id);
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public Condominio criarCadastro(@Valid @RequestBody Condominio condominio) {

		condominio.set_id(ObjectId.get());
		condominioRepository.save(condominio);
		return condominio;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void editarCondominiosById(@PathVariable("id") ObjectId id, @Valid @RequestBody Condominio condominio) {
		condominio.set_id(id);
		condominioRepository.save(condominio);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable ObjectId _id) {
		condominioRepository.delete(condominioRepository.findBy_id(_id));
	}
}
