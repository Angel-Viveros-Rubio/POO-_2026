package edu.angel.viveros.actividad3.test;

import edu.angel.viveros.actividad3.process.MenorSalarioEdadMenosComun;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.angel.viveros.actividad3.process.Empleado;

public class MenorSalarioEdadMenosComunTest {

    @Test
    public void testCasoNormal() {
        Empleado e1 = new Empleado(); e1.Edad = 25; e1.sueldo = 15000; e1.nombre = "Ana";
        Empleado e2 = new Empleado(); e2.Edad = 30; e2.sueldo = 20000; e2.nombre = "Luis";
        Empleado e3 = new Empleado(); e3.Edad = 30; e3.sueldo = 22000; e3.nombre = "Pedro";
        Empleado e4 = new Empleado(); e4.Edad = 35; e4.sueldo = 18000; e4.nombre = "Maria";
        Empleado e5 = new Empleado(); e5.Edad = 40; e5.sueldo = 12000; e5.nombre = "Juan";  // edad única y bajo sueldo

        List<Empleado> lista = Arrays.asList(e1, e2, e3, e4, e5);

        // Edades: 25(1), 30(2), 35(1), 40(1) → menos común: 25,35,40
        // Sueldos de ellos: Ana 15000, Maria 18000, Juan 12000 → menor: Juan
        Empleado resultado = MenorSalarioEdadMenosComun.menorSalarioEdadMenosComun(lista);
        assertNotNull(resultado);
        assertEquals("Juan", resultado.nombre);
        assertEquals(12000, resultado.sueldo);
    }

    @Test
    public void testTodasEdadesUnicas() {
        Empleado e1 = new Empleado(); e1.Edad = 20; e1.sueldo = 10000; e1.nombre = "Primero";
        Empleado e2 = new Empleado(); e2.Edad = 25; e2.sueldo = 8000; e2.nombre = "Segundo";

        List<Empleado> lista = Arrays.asList(e1, e2);

        // Todas únicas → menor sueldo: Segundo
        Empleado resultado = MenorSalarioEdadMenosComun.menorSalarioEdadMenosComun(lista);
        assertEquals("Segundo", resultado.nombre);
    }

    @Test
    public void testUnaEdadMenosComun() {
        Empleado e1 = new Empleado(); e1.Edad = 30; e1.sueldo = 25000;
        Empleado e2 = new Empleado(); e2.Edad = 30; e2.sueldo = 26000;
        Empleado e3 = new Empleado(); e3.Edad = 28; e3.sueldo = 15000; e3.nombre = "Raro";

        List<Empleado> lista = Arrays.asList(e1, e2, e3);
        // 30 aparece 2 veces, 28 una → menos común: 28
        assertEquals("Raro", MenorSalarioEdadMenosComun.menorSalarioEdadMenosComun(lista).nombre);
    }

    @Test
    public void testListaVacia() {
        assertNull(MenorSalarioEdadMenosComun.menorSalarioEdadMenosComun(new ArrayList<>()));
    }

    @Test
    public void testNull() {
        assertNull(MenorSalarioEdadMenosComun.menorSalarioEdadMenosComun(null));
    }

    @Test
    public void testUnSoloEmpleado() {
        Empleado e = new Empleado(); e.Edad = 22; e.sueldo = 10000; e.nombre = "Solo";
        List<Empleado> lista = Arrays.asList(e);
        assertEquals("Solo", MenorSalarioEdadMenosComun.menorSalarioEdadMenosComun(lista).nombre);
    }
}