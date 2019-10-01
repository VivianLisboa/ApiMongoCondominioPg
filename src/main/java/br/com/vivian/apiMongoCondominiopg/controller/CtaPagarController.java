package br.com.vivian.apiMongoCondominiopg.controller;

import java.util.List;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.vivian.apiMongoCondominiopg.domain.CtaPagar;
import br.com.vivian.apiMongoCondominiopg.repository.CtaPagarRepository;

@RestController
@RequestMapping(value = "/condominiopg")
public class CtaPagarController {

	@Autowired

	private CtaPagarRepository ctaPagarRepository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<CtaPagar> getCtaPagar() {
		return ctaPagarRepository.findAll();
	}

	@RequestMapping(value = "/{_id}", method = RequestMethod.GET)
	public CtaPagar getCtaPagarById_id(@PathVariable("_id") ObjectId _id) {
		return ctaPagarRepository.findBy_id(_id);
	}

	// me perdi aqui

	// @RequestMapping(value = "/", method = RequestMethod.POST)
	// public CtaPagar criarPlanilha(@Valid @RequestBody CtaPagar ctaPagar) {
	//
	// }
}
