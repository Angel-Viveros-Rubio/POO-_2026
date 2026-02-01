package edu.angel.viveros.actividad3.test;

import edu.angel.viveros.actividad3.process.NumerosPares;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class NumerosParesTest {
    @Test
    public void testEjemploBasico() {
        List<Integer> lista = new ArrayList<>(Arrays.asList(3, 4, 5, 7, 6));
        int resultado = NumerosPares.contarNumerosPares(lista);
        assertEquals(2, resultado);
    }

    @Test
    public void testTodosImpares() {
        List<Integer> lista = new ArrayList<>(Arrays.asList(1, 3, 5, 7));

        assertEquals(0, NumerosPares.contarNumerosPares(lista));
    }

    @Test
    public void testListaVacia() {
        List<Integer> lista = new ArrayList<>();

        assertEquals(0, NumerosPares.contarNumerosPares(lista));
    }
}
