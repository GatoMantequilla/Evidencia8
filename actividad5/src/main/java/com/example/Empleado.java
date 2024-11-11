package com.example;

public class Empleado {
	private String nombre;
	private int edad;
	private int id;
	private Empresa empresa;
	private Departamento departamento;


	public Empleado(String nombre, int edad, int id) {
		this.nombre = nombre;
		this.edad = edad;
		this.id = id;
	}

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getId() {
        return id;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Empresa getEmpresa(){
        return empresa;
    }

    public Departamento Departamento (Departamento departamento) {
        return this.departamento;
    }

    @Override
	public String toString() {
		return "Nombre: " + nombre + " Edad: " + edad + " Id: " + id;
	}
}

