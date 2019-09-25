package br.com.vivian.apiMongoCondominiopg.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.vivian.apiMongoCondominiopg.domain.Condominio;

public interface CondominioRepository extends MongoRepository<Condominio, String> {

	Condominio findBy_id(ObjectId _id);
}
