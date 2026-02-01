package edu.angel.viveros.actividad3.test;

import edu.angel.viveros.actividad3.process.PromedioSalario;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.angel.viveros.actividad3.process.Empleado;

public class PromedioSalarioTest {

    @Test
    public void testPromedioNormal() {
        Empleado e1 = new Empleado();
        e1.sueldo = 10000;

        Empleado e2 = new Empleado();
        e2.sueldo = 15000;

        Empleado e3 = new Empleado();
        e3.sueldo = 20000;

        List<Empleado> lista = Arrays.asList(e1, e2, e3);

        double resultado = PromedioSalario.calcularPromedioSalario(lista);

        assertEquals(15000.0, resultado, 0.001);  // 10000+15000+20000 = 45000 / 3 = 15000
    }

    @Test
    public void testListaVacia() {
        List<Empleado> lista = new ArrayList<>();
        assertEquals(0.0, PromedioSalario.calcularPromedioSalario(lista), 0.001);
    }

    @Test
    public void testUnSoloEmpleado() {
        Empleado e = new Empleado();
        e.sueldo = 12000;

        assertEquals(12000.0, PromedioSalario.calcularPromedioSalario(Arrays.asList(e)), 0.001);
    }

    @Test
    public void testNull() {
        assertEquals(0.0, PromedioSalario.calcularPromedioSalario(null), 0.001);
    }

    @Test
    public void testSueldosIguales() {
        Empleado e1 = new Empleado(); e1.sueldo = 18000;
        Empleado e2 = new Empleado(); e2.sueldo = 18000;
        Empleado e3 = new Empleado(); e3.sueldo = 18000;

        List<Empleado> lista = Arrays.asList(e1, e2, e3);
        assertEquals(18000.0, PromedioSalario.calcularPromedioSalario(lista), 0.001);
    }
}