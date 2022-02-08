package com.patronesdisenio.patronesSpring.proxy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersonaProxyImp implements IPersonProxy, CommandLineRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	Persona person;

	public PersonaProxyImp(Persona person) {
		super();
		this.person = person;
	}

	@Override
	public void operacion() {
		System.out.println("Este es el mensaje de antes");
		person.operacion();
		System.out.println("Este es el mensaje de despues");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

	}

}
