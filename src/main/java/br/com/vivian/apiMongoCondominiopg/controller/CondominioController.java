package br.com.vivian.apiMongoCondominiopg.controller;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/condominiopg")
public class CondominioController {

	@Autowired

	private CondominioRepository condominioRepository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Condominios> getCondominios() {
		return repository.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Condominios getCondominiosById(@PathVariable("id")ObjectId) {
		
		return repository.findBy_id(id);
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public Condominios criarCadastro(@Valid @RequestBody Condominios condominios) {

		Condominios.set_id(ObjectId.get());
		repository.save(condominios);
		return condominio;
	}

	@RequestMapping(value = "/{id}", methor = RequestMethod.PUT)
	public void editarCondominiosById(@PathVariable("id")ObjectId id,@Valid @RequestBody Condominios condominios) {
	condominios.set_id(id);
	repository.save(condominio);

	}

@RequestMapping(value = "/{id}", method =RequestMethod.DELETE)
public void delete(repository.find_id(id));
}