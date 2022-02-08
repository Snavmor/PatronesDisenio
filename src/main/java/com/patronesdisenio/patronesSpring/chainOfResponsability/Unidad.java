package com.patronesdisenio.patronesSpring.chainOfResponsability;

import lombok.Builder;

@Builder
public class Unidad {

	private String nombre;
	private Unidad subordinado;

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the subordinado
	 */
	public Unidad getSubordinado() {
		return subordinado;
	}

	/**
	 * @param subordinado the subordinado to set
	 */
	public void setSubordinado(Unidad subordinado) {
		this.subordinado = subordinado;
	}

	public void ejecutarOrden() {
		if (subordinado != null) {
			System.out.println("Te paso la orden " + subordinado.getNombre());

			subordinado.ejecutarOrden();
		} else {
			System.out.println("Te toca pringar soldado");
		}

	}

}
