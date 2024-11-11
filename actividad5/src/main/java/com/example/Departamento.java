package com.example;

import java.util.ArrayList;

public class Departamento {
    private String nombre;
    private ArrayList<Empleado> empleados;
    private Empleado administrador;
    private Empresa empresa;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        if (empleado.getEmpresa()== null) {
            empleados.add(empleado);
            empleado.setEmpresa(this.empresa);
        }
        empleados.add(empleado);
    }

    public void asignarAdministrador(Empleado administrador) {
        this.administrador = administrador;
    }

    public ArrayList<Empleado> mostrarEmpleados() {
        return empleados;
    }

    public Empleado verAdministrador() {
        return administrador;
    }

    public String getNombre() {
        return nombre;
    }

    public Empresa getEmpresa(){
        return empresa;
    }

    public void setEmpresa(Empresa empresa){
        this.empresa = empresa;
    }

    
}

