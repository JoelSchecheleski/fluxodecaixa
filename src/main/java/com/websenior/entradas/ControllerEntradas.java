package com.websenior.entradas;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerEntradas {
		
	/**
	 * Busca todas as entradas 
	 * @param entreda
	 * @return retorna um objeto JSON contendo a entrada
	 */
	@RequestMapping(value="/api/v1/entrada", method=RequestMethod.POST)
	public Entrada getEntrada(@RequestBody Entrada entrada) {
		return entrada;
	}
	
	
	
}


