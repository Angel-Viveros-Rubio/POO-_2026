package edu.angel.viveros.actividad3.test;

import edu.angel.viveros.actividad3.process.MenoresDe25;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.angel.viveros.actividad3.process.Empleado;

public class MenoresDe25Test {

    @Test
    public void testAlgunosMenores() {
        Empleado e1 = new Empleado(); e1.Edad = 22; e1.nombre = "Ana";
        Empleado e2 = new Empleado(); e2.Edad = 30; e2.nombre = "Luis";
        Empleado e3 = new Empleado(); e3.Edad = 24; e3.nombre = "Pedro";
        Empleado e4 = new Empleado(); e4.Edad = 28; e4.nombre = "Maria";

        List<Empleado> lista = Arrays.asList(e1, e2, e3, e4);

        List<Empleado> resultado = MenoresDe25.filtrarMenoresDe25(lista);

        assertEquals(2, resultado.size());  // Ana (22) y Pedro (24)
        assertTrue(resultado.contains(e1));
        assertTrue(resultado.contains(e3));
        assertFalse(resultado.contains(e2));
        assertFalse(resultado.contains(e4));
    }

    @Test
    public void testNingunMenor() {
        Empleado e1 = new Empleado(); e1.Edad = 30;
        Empleado e2 = new Empleado(); e2.Edad = 40;

        List<Empleado> lista = Arrays.asList(e1, e2);
        List<Empleado> resultado = MenoresDe25.filtrarMenoresDe25(lista);

        assertTrue(resultado.isEmpty());
    }

    @Test
    public void testTodosMenores() {
        Empleado e1 = new Empleado(); e1.Edad = 20;
        Empleado e2 = new Empleado(); e2.Edad = 23;

        List<Empleado> lista = Arrays.asList(e1, e2);
        List<Empleado> resultado = MenoresDe25.filtrarMenoresDe25(lista);

        assertEquals(2, resultado.size());
        assertTrue(resultado.contains(e1));
        assertTrue(resultado.contains(e2));
    }

    @Test
    public void testListaVacia() {
        List<Empleado> lista = new ArrayList<>();
        List<Empleado> resultado = MenoresDe25.filtrarMenoresDe25(lista);
        assertTrue(resultado.isEmpty());
    }

    @Test
    public void testNull() {
        List<Empleado> resultado = MenoresDe25.filtrarMenoresDe25(null);
        assertTrue(resultado.isEmpty());
    }
}