package com.example;

public class Oficina {
	private String nombre;
	private Boolean oficina;
	private Empresa empresa;

	public Oficina( String nombre, Boolean oficina) {
		this.nombre = nombre;
		this.oficina = oficina;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public Boolean getOficinaCentral() {
		return oficina;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + " Oficina central: " + oficina;
	}

    
}
