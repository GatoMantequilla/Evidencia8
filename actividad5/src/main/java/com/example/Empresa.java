package com.example;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    ArrayList<Departamento> departamentos;
    protected ArrayList<Oficina> oficinas;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.departamentos = new ArrayList<>();
        this.oficinas = new ArrayList<>();
    }

    public String getNombre(){
        return this.nombre;
       }

	public void agregarDepartamento(Departamento departamento) {
		if (departamento.getEmpresa() == null) {
            departamento.setEmpresa(this);
			departamentos.add(departamento);
			
		} else {
			System.out.println("El departamento ya pertenece tiene a una empresa asignada");
		}
	}

	public void mostrarDepartamentos() {
		try {
			for (Departamento departamento : departamentos) {
				System.out.println(departamento.toString());
			}
		} catch (NullPointerException e) {
			System.out.println("No existen departamentos en esta empresa");
		}
	}

    public void agregarOficina(Oficina oficina) {
		if (oficina.getEmpresa() == null) {
			oficina.setEmpresa(this);
			oficinas.add(oficina);
		} else {
			System.out.println("La oficina ya pertenece tiene a una empresa asignada");
		}
	}

	public void mostrarOficinas() {
		try {
			for (Oficina oficina : oficinas) {
				System.out.println(oficina.toString());
			}
		} catch (NullPointerException e) {
			System.out.println("No existen oficinas en esta empresa");
		}
	}

    public ArrayList<Empleado> getOficinas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getOficinas'");
    }

    

    


}
