package com.micro.springboot.app.commons;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//EnableAutoConfiguration se deshabilita la autoconfig del datasource de JPA

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class SpringbootServicioCommonsApplication {

	//Metodo main eliminado al este proyecto ser una libreria

}
