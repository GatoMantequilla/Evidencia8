package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestEmpresa {

    @Test
    public void testAgregarEmpleadoAlDepartamento() {
        Departamento departamento = new Departamento("Los Soles");
        Empleado empleado = new Empleado("Juan Pablo", 30, 1);

        departamento.agregarEmpleado(empleado);

        assertEquals(1, departamento.mostrarEmpleados().size(), "El empleado no se agrego correctamente");
        assertEquals("Juan Pablo", departamento.mostrarEmpleados().get(0).getNombre(), "El nombre del empleado no coincide");
        assertNull(empleado.getEmpresa(), "El empleado no deberia tener empresa asignada");
    }

    @Test
    public void testAgregarOficina() {
        Empresa empresa = new Empresa("Churrasco INC");
        Oficina oficina = new Oficina("Calle Falsa 123", true);

        empresa.agregarOficina(oficina);

        assertEquals(1, empresa.getOficinas().size(), "La oficina no se agrego correctamente");
        assertEquals("Calle Falsa 123", empresa.getOficinas().get(0).getNombre(), "El nombre de la oficina no coincide");
        assertEquals(empresa, oficina.getEmpresa(), "La oficina no tiene la empresa asignada");
    }
}
