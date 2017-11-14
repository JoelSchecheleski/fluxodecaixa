package com.websenior.application;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.websenior.application.Usuario;
import com.websenior.entradas.ControllerEntradas;

//import io.swagger.jaxrs.config.BeanConfig;

@RestController
public class IndexController extends ControllerEntradas{
	
/*	@RequestMapping(value = "/api/v1/PagamentoService", method = RequestMethod.GET)
	public BeanConfig PagamentoService() {
		BeanConfig conf = new BeanConfig();
		conf.setTitle("Payfast API");
		conf.setDescription("Pagamentos rápidos");
		conf.setVersion("1.0.0");
		conf.setHost("localhost:8080");
		conf.setBasePath("/api/v1");
		conf.setSchemes(new String[] { "http" });
		conf.setResourcePackage("com.websenior.curso");
		conf.setScan(true);
		
		return conf;
	}*/

	@RequestMapping(value = "/api/v1", method = RequestMethod.GET)
	public String index() {
		return "Essa é a página inicial da API";
	}


	
}
