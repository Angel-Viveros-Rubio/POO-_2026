package edu.angel.viveros.actividad3.test;

import edu.angel.viveros.actividad3.process.PromedioEdad;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.angel.viveros.actividad3.process.Empleado;

public class PromedioEdadTest {

    @Test
    public void testPromedioNormal() {
        Empleado e1 = new Empleado();
        e1.Edad = 20;

        Empleado e2 = new Empleado();
        e2.Edad = 30;

        Empleado e3 = new Empleado();
        e3.Edad = 40;

        List<Empleado> lista = Arrays.asList(e1, e2, e3);

        double resultado = PromedioEdad.calcularPromedioEdad(lista);

        assertEquals(30.0, resultado, 0.001);  // 20+30+40 = 90 / 3 = 30.0
    }

    @Test
    public void testListaVacia() {
        List<Empleado> lista = new ArrayList<>();
        assertEquals(0.0, PromedioEdad.calcularPromedioEdad(lista), 0.001);
    }

    @Test
    public void testUnSoloEmpleado() {
        Empleado e = new Empleado();
        e.Edad = 25;

        assertEquals(25.0, PromedioEdad.calcularPromedioEdad(Arrays.asList(e)), 0.001);
    }

    @Test
    public void testNull() {
        assertEquals(0.0, PromedioEdad.calcularPromedioEdad(null), 0.001);
    }

    @Test
    public void testEdadesIguales() {
        Empleado e1 = new Empleado(); e1.Edad = 22;
        Empleado e2 = new Empleado(); e2.Edad = 22;
        Empleado e3 = new Empleado(); e3.Edad = 22;

        List<Empleado> lista = Arrays.asList(e1, e2, e3);
        assertEquals(22.0, PromedioEdad.calcularPromedioEdad(lista), 0.001);
    }
}