package com.websenior.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

//import io.swagger.jaxrs.config.BeanConfig;

@ApplicationPath("/api/v1")
public class PagamentoService extends Application {
/*  public PagamentoService() {
    BeanConfig conf = new BeanConfig();
    conf.setTitle("Payfast API");
    conf.setDescription("Pagamentos rápidos");
    conf.setVersion("1.0.0");
    conf.setHost("localhost:8080");
    conf.setBasePath("/api/v1");
    conf.setSchemes(new String[] { "http" });
    conf.setResourcePackage("com.websenior.curso");
    conf.setScan(true);
  }
  */
	
/*  @Override
  public Set<Class<?>> getClasses() {
      Set<Class<?>> resources = new HashSet<Class<?>>();
      resources.add(JacksonJavaTimeConfiguration.class);
      resources.add(PagamentoResource.class);
       
      //classes do swagger...
      resources.add(ApiListingResource.class);
      resources.add(SwaggerSerializers.class);
      return resources;
   }*/
}
