package edu.angel.viveros.actividad3.test;

import edu.angel.viveros.actividad3.process.EdadMasComun;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.angel.viveros.actividad3.process.Empleado;

public class EdadMasComunTest {

    @Test
    public void testEdadMasRepetida() {
        Empleado e1 = new Empleado(); e1.Edad = 25;
        Empleado e2 = new Empleado(); e2.Edad = 30;
        Empleado e3 = new Empleado(); e3.Edad = 25;
        Empleado e4 = new Empleado(); e4.Edad = 35;
        Empleado e5 = new Empleado(); e5.Edad = 25;

        List<Empleado> lista = Arrays.asList(e1, e2, e3, e4, e5);

        assertEquals(25, EdadMasComun.edadMasComun(lista));  // 25 aparece 3 veces
    }

    @Test
    public void testTodasEdadesDiferentes() {
        Empleado e1 = new Empleado(); e1.Edad = 20;
        Empleado e2 = new Empleado(); e2.Edad = 30;
        Empleado e3 = new Empleado(); e3.Edad = 40;

        List<Empleado> lista = Arrays.asList(e1, e2, e3);

        // Cualquiera vale porque todas aparecen 1 vez, devuelve la primera que encuentre
        int resultado = EdadMasComun.edadMasComun(lista);
        assertTrue(resultado == 20 || resultado == 30 || resultado == 40);
    }

    @Test
    public void testListaVacia() {
        assertEquals(0, EdadMasComun.edadMasComun(new ArrayList<>()));
    }

    @Test
    public void testUnSoloEmpleado() {
        Empleado e = new Empleado(); e.Edad = 28;
        assertEquals(28, EdadMasComun.edadMasComun(Arrays.asList(e)));
    }

    @Test
    public void testEmpate() {
        Empleado e1 = new Empleado(); e1.Edad = 33;
        Empleado e2 = new Empleado(); e2.Edad = 33;
        Empleado e3 = new Empleado(); e3.Edad = 22;
        Empleado e4 = new Empleado(); e4.Edad = 22;

        List<Empleado> lista = Arrays.asList(e1, e2, e3, e4);
        assertEquals(33, EdadMasComun.edadMasComun(lista));
    }
}