package br.com.github.thiagodsaraujo.linguagensapi;


import org.springframework.data.mongodb.repository.MongoRepository;

public interface LinguagemRepository extends MongoRepository<Linguagem, String> {

}
