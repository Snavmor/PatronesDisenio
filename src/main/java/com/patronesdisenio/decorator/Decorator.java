package com.patronesdisenio.decorator;

import com.patronesdisenio.patronesSpring.Persona;

import lombok.Builder;
@Builder
public class Decorator implements IPersona {

	Persona person;

	/**
	 * @param person the person to set
	 */
	public void setPerson(Persona person) {
		this.person = person;
	}

	@Override
	public String getName() {
		return person.getNombre() + "este es mi nombre";
		// TODO Auto-generated method stub

	}

	@Override
	public int getEdad() {
		return person.getEdad() *85;
		// TODO Auto-generated method stub

	}

}
