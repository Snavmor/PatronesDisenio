package com.patronesdisenio.patronesSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.patronesdisenio.patronesSpring.proxy.PersonaProxyImp;

@SpringBootApplication
public class PatronesSpringApplication implements CommandLineRunner{

	@Autowired
	private ApplicationContext context;

	public static void main(String[] args)  {
		SpringApplication.run(PatronesSpringApplication.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println(context.getBean("personaPrototype"));	
//		System.out.println(context.getBean("personaPrototype"));		
//		System.out.println(context.getBean("personaPrototype"));		
//		System.out.println(context.getBean("personaPrototype"));	
//		System.out.println(context.getBean("personaSingleton"));	
//		System.out.println(context.getBean("personaSingleton"));	
//		System.out.println(context.getBean("personaSingleton"));	
//		System.out.println(context.getBean("personaSingleton"));
		
		//Decorator
		Persona person = new Persona ("pepe", 45);
		PersonaProxyImp proxy = new PersonaProxyImp(person);
		




	}

}
