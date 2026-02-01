package edu.angel.viveros.actividad3.test;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.angel.viveros.actividad3.process.ContarDepartamentoSistemas;
import edu.angel.viveros.actividad3.process.Empleado;

public class ContarDepartamentoSistemasTest {

    @Test
    public void testAlgunosEnSistemas() {
        Empleado e1 = new Empleado(); e1.Departamento = "sistemas";
        Empleado e2 = new Empleado(); e2.Departamento = "ventas";
        Empleado e3 = new Empleado(); e3.Departamento = "Sistemas";  // con mayúscula
        Empleado e4 = new Empleado(); e4.Departamento = "SISTEMAS";  // todo mayúsculas

        List<Empleado> lista = Arrays.asList(e1, e2, e3, e4);

        int resultado = ContarDepartamentoSistemas.contarDepartamentoSistemas(lista);
        assertEquals(3, resultado);  // ahora cuenta e1, e3 y e4
    }

    @Test
    public void testNingunoEnSistemas() {
        Empleado e1 = new Empleado(); e1.Departamento = "ventas";
        Empleado e2 = new Empleado(); e2.Departamento = "contabilidad";

        List<Empleado> lista = Arrays.asList(e1, e2);
        assertEquals(0, ContarDepartamentoSistemas.contarDepartamentoSistemas(lista));
    }

    @Test
    public void testTodosEnSistemas() {
        Empleado e1 = new Empleado(); e1.Departamento = "sistemas";
        Empleado e2 = new Empleado(); e2.Departamento = "Sistemas";

        List<Empleado> lista = Arrays.asList(e1, e2);
        assertEquals(2, ContarDepartamentoSistemas.contarDepartamentoSistemas(lista));
    }

    @Test
    public void testDepartamentoNull() {
        Empleado e1 = new Empleado(); e1.Departamento = null;
        Empleado e2 = new Empleado(); e2.Departamento = "sistemas";

        List<Empleado> lista = Arrays.asList(e1, e2);
        assertEquals(1, ContarDepartamentoSistemas.contarDepartamentoSistemas(lista));
    }

    @Test
    public void testListaVacia() {
        assertEquals(0, ContarDepartamentoSistemas.contarDepartamentoSistemas(new ArrayList<>()));
    }

    @Test
    public void testNull() {
        assertEquals(0, ContarDepartamentoSistemas.contarDepartamentoSistemas(null));
    }

    @Test
    public void testMezclaMayusculasMinusculas() {
        Empleado e = new Empleado(); e.Departamento = "SiStEmAs";  // mezcla rara
        List<Empleado> lista = Arrays.asList(e);
        assertEquals(1, ContarDepartamentoSistemas.contarDepartamentoSistemas(lista));
    }
}