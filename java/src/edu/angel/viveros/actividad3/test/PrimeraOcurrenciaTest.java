package edu.angel.viveros.actividad3.test;

import edu.angel.viveros.actividad3.process.PrimeraOcurrencia;
import org.junit.Test;
import static org.junit.Assert.*;


public class PrimeraOcurrenciaTest {

    @Test
    public void testEjemploOEnHola() {
        assertEquals(1, PrimeraOcurrencia.primeraOcurrencia("hola", 'o'));
    }

    @Test
    public void testEjemploREnHola() {
        assertEquals(-1, PrimeraOcurrencia.primeraOcurrencia("hola", 'r'));
    }

    @Test
    public void testCaracterAlInicio() {
        assertEquals(0, PrimeraOcurrencia.primeraOcurrencia("abc", 'a'));
    }

    @Test
    public void testCaracterAlFinal() {
        assertEquals(3, PrimeraOcurrencia.primeraOcurrencia("holaa", 'a'));
    }

    @Test
    public void testNoEsta() {
        assertEquals(-1, PrimeraOcurrencia.primeraOcurrencia("xyz", 'k'));
    }

    @Test
    public void testCadenaVacia() {
        assertEquals(-1, PrimeraOcurrencia.primeraOcurrencia("", 'a'));
    }

    @Test
    public void testNull() {
        assertEquals(-1, PrimeraOcurrencia.primeraOcurrencia(null, 'a'));
    }

    @Test
    public void testCaracterRepetido() {
        assertEquals(1, PrimeraOcurrencia.primeraOcurrencia("book", 'o'));  // primera 'o' en posición 1
    }
}