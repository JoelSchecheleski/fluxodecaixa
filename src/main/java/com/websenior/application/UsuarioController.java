package com.websenior.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

	@Autowired
	UsuarioRepository repository;
	
	@RequestMapping(value="/api/v1/usuario", method=RequestMethod.GET)
	public List<Usuario> listaUsuario(){
		return repository.findAll();
	}
	
	@RequestMapping(value="/api/v1/usuario", method=RequestMethod.POST)
	public Usuario postUsuario(@RequestBody Usuario usuario) {
		return repository.save(usuario);
	}
	
	@RequestMapping(value="api/v1/usuario", method=RequestMethod.PUT)
	public Usuario putUsario(@RequestBody Usuario usuario) {
		return repository.save(usuario);
	}
	
	@RequestMapping(value="api/v1/usuario/{id}", method=RequestMethod.DELETE)
	public void deleteUsario(@PathVariable String id) {
		repository.delete(id);
	}	
}
