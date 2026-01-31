package edu.angel.viveros.actividad3.test;

import edu.angel.viveros.actividad3.process.MayorSalarioMayor30;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.angel.viveros.actividad3.process.Empleado;

public class MayorSalarioMayor30Test {

    @Test
    public void testMayorSalarioConMayores30() {
        Empleado e1 = new Empleado(); e1.Edad = 25; e1.sueldo = 20000; e1.nombre = "Ana";
        Empleado e2 = new Empleado(); e2.Edad = 35; e2.sueldo = 30000; e2.nombre = "Luis";
        Empleado e3 = new Empleado(); e3.Edad = 40; e3.sueldo = 45000; e3.nombre = "Pedro";
        Empleado e4 = new Empleado(); e4.Edad = 32; e4.sueldo = 40000; e4.nombre = "Maria";

        List<Empleado> lista = Arrays.asList(e1, e2, e3, e4);

        Empleado resultado = MayorSalarioMayor30.mayorSalarioMayor30(lista);
        assertNotNull(resultado);
        assertEquals("Pedro", resultado.nombre);
        assertEquals(45000, resultado.sueldo);
    }

    @Test
    public void testNingunoMayor30() {
        Empleado e1 = new Empleado(); e1.Edad = 22; e1.sueldo = 50000;
        Empleado e2 = new Empleado(); e2.Edad = 28; e2.sueldo = 60000;

        List<Empleado> lista = Arrays.asList(e1, e2);
        assertNull(MayorSalarioMayor30.mayorSalarioMayor30(lista));
    }

    @Test
    public void testUnSoloMayor30() {
        Empleado e1 = new Empleado(); e1.Edad = 20; e1.sueldo = 10000;
        Empleado e2 = new Empleado(); e2.Edad = 35; e2.sueldo = 35000; e2.nombre = "Juan";

        List<Empleado> lista = Arrays.asList(e1, e2);
        Empleado resultado = MayorSalarioMayor30.mayorSalarioMayor30(lista);
        assertEquals("Juan", resultado.nombre);
        assertEquals(35000, resultado.sueldo);
    }

    @Test
    public void testListaVacia() {
        assertNull(MayorSalarioMayor30.mayorSalarioMayor30(new ArrayList<>()));
    }

    @Test
    public void testNull() {
        assertNull(MayorSalarioMayor30.mayorSalarioMayor30(null));
    }

    @Test
    public void testEmpateSalario() {
        Empleado e1 = new Empleado(); e1.Edad = 35; e1.sueldo = 50000; e1.nombre = "Primero";
        Empleado e2 = new Empleado(); e2.Edad = 40; e2.sueldo = 50000; e2.nombre = "Segundo";

        List<Empleado> lista = Arrays.asList(e1, e2);
        // Devuelve el primero que encuentre (e1)
        assertEquals("Primero", MayorSalarioMayor30.mayorSalarioMayor30(lista).nombre);
    }
}