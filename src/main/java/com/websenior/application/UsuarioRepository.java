package com.websenior.application;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * 
 * @author Joel_
 *
 */
public interface UsuarioRepository extends MongoRepository<Usuario, String> {

}
