package edu.angel.viveros.actividad3.test;

import edu.angel.viveros.actividad3.process.PromedioEdadMayores25K;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import edu.angel.viveros.actividad3.process.Empleado;

public class PromedioEdadMayores25KTest {

    @Test
    public void testPromedioConAlgunosMayores() {
        Empleado e1 = new Empleado(); e1.sueldo = 20000; e1.Edad = 22;
        Empleado e2 = new Empleado(); e2.sueldo = 30000; e2.Edad = 35;
        Empleado e3 = new Empleado(); e3.sueldo = 40000; e3.Edad = 45;
        Empleado e4 = new Empleado(); e4.sueldo = 28000; e4.Edad = 30;

        List<Empleado> lista = Arrays.asList(e1, e2, e3, e4);

        // Solo e2, e3 y e4 ganan >25K → edades 35,45,30 → promedio 36.666...
        double resultado = PromedioEdadMayores25K.calcularPromedioEdadMayores25K(lista);
        assertEquals(36.666, resultado, 0.001);
    }

    @Test
    public void testNingunoMayor25K() {
        Empleado e1 = new Empleado(); e1.sueldo = 15000; e1.Edad = 20;
        Empleado e2 = new Empleado(); e2.sueldo = 20000; e2.Edad = 25;

        List<Empleado> lista = Arrays.asList(e1, e2);
        assertEquals(0.0, PromedioEdadMayores25K.calcularPromedioEdadMayores25K(lista), 0.001);
    }

    @Test
    public void testTodosMayores25K() {
        Empleado e1 = new Empleado(); e1.sueldo = 30000; e1.Edad = 40;
        Empleado e2 = new Empleado(); e2.sueldo = 50000; e2.Edad = 50;

        List<Empleado> lista = Arrays.asList(e1, e2);
        assertEquals(45.0, PromedioEdadMayores25K.calcularPromedioEdadMayores25K(lista), 0.001);
    }

    @Test
    public void testListaVacia() {
        assertEquals(0.0, PromedioEdadMayores25K.calcularPromedioEdadMayores25K(new ArrayList<>()), 0.001);
    }

    @Test
    public void testNull() {
        assertEquals(0.0, PromedioEdadMayores25K.calcularPromedioEdadMayores25K(null), 0.001);
    }
}