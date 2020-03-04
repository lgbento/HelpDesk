package br.unipe.luisdev.web.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.unipe.luisdev.web.api.entity.User;

public interface UserRepository extends MongoRepository<User, String>{

	User findByEmail(String email);


}
