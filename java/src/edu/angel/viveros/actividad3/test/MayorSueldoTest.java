package edu.angel.viveros.actividad3.test;

import edu.angel.viveros.actividad3.process.MayorSueldo;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.angel.viveros.actividad3.process.Empleado;

public class MayorSueldoTest {
//Test Generados Por ChatGpt
    @Test
    public void testMayorSueldoNormal() {
        Empleado e1 = new Empleado();
        e1.nombre = "Juan"; e1.sueldo = 10000; e1.Edad = 30;

        Empleado e2 = new Empleado();
        e2.nombre = "Ana"; e2.sueldo = 15000; e2.Edad = 25;

        Empleado e3 = new Empleado();
        e3.nombre = "Pedro"; e3.sueldo = 12000; e3.Edad = 40;

        List<Empleado> lista = new ArrayList<>(Arrays.asList(e1, e2, e3));

        Empleado resultado = MayorSueldo.mayorSueldo(lista);
        assertEquals("Ana", resultado.nombre);
        assertEquals(15000, resultado.sueldo);
    }

    @Test
    public void testListaVacia() {
        assertNull(MayorSueldo.mayorSueldo(new ArrayList<>()));
    }

    @Test
    public void testUnSoloEmpleado() {
        Empleado e = new Empleado();
        e.nombre = "Luis"; e.sueldo = 8000;

        List<Empleado> lista = Arrays.asList(e);
        assertEquals(e, MayorSueldo.mayorSueldo(lista));
    }

    @Test
    public void testEmpateSueldo() {
        Empleado e1 = new Empleado();
        e1.sueldo = 20000;

        Empleado e2 = new Empleado();
        e2.sueldo = 20000;

        List<Empleado> lista = Arrays.asList(e1, e2);

        assertEquals(e1, MayorSueldo.mayorSueldo(lista));
    }
}