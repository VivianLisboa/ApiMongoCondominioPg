package br.com.vivian.apiMongoCondominiopg.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.vivian.apiMongoCondominiopg.domain.CtaPagar;

public interface CtaPagarRepository extends MongoRepository<CtaPagar, String>{

	CtaPagar findBy_id(ObjectId _id);
}
