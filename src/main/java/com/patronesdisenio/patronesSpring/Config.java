package com.patronesdisenio.patronesSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {
	
	//creamos un bean que devuelve a una persona y le asignamos un nombre al bean
	@Bean (name = "personaPrototype")
	@Scope ("prototype")
	public Persona personaPrototype() {
		return new Persona("Juan", 45);
		
	}
	
	@Bean (name = "personaSingleton")
	//@Scope ("singleton")
	public Persona personaSingleton() {
		return new Persona("Juan", 45);
		
	} 

}
