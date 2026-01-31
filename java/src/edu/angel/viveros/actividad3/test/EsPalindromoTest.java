package edu.angel.viveros.actividad3.test;

import org.junit.Test;
import static org.junit.Assert.*;

import edu.angel.viveros.actividad3.process.EsPalindromo;  // Ajusta si el paquete es diferente

public class EsPalindromoTest {

    @Test
    public void testEjemploAna() {
        assertTrue(EsPalindromo.esPalindromo("ana"));
    }

    @Test
    public void testEjemploHolaMundo() {
        assertFalse(EsPalindromo.esPalindromo("hola mundo"));
    }

    @Test
    public void testConEspacios() {
        assertTrue(EsPalindromo.esPalindromo("a b a"));
        assertFalse(EsPalindromo.esPalindromo("a b c"));
    }
}