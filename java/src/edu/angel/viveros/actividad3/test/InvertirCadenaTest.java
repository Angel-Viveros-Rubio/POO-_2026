package edu.angel.viveros.actividad3.test;

import edu.angel.viveros.actividad3.process.InvertirCadena;
import org.junit.Test;
import static org.junit.Assert.*;

public class InvertirCadenaTest {

    @Test
    public void testEjemploHola() {
        assertEquals("aloh", InvertirCadena.invertirCadena("hola"));
    }

    @Test
    public void testPalabraLarga() {
        assertEquals("aloh adios", InvertirCadena.invertirCadena("soida hola"));
    }

    @Test
    public void testUnCaracter() {
        assertEquals("a", InvertirCadena.invertirCadena("a"));
    }

    @Test
    public void testCadenaVacia() {
        assertEquals("", InvertirCadena.invertirCadena(""));
    }

    @Test
    public void testNull() {
        assertNull(InvertirCadena.invertirCadena(null));
    }

    @Test
    public void testConMayusculasYEspacios() {
        assertEquals("AloH Mundo", InvertirCadena.invertirCadena("odnuM HolA"));
    }

    @Test
    public void testPalindromo() {
        String original = "ana";
        assertEquals(original, InvertirCadena.invertirCadena(original));  // palíndromo queda igual
    }
}