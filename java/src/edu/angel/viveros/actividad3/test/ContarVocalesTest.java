package edu.angel.viveros.actividad3.test;

import edu.angel.viveros.actividad3.process.ContarVocales;
import org.junit.Test;
import static org.junit.Assert.*;

public class ContarVocalesTest {

    @Test
    public void testEjemploHola() {
        assertEquals(2,//resultado esperado que me de el programa :3
                ContarVocales.contarVocales("hola"));
    }

    @Test
    public void testConMayusculas() {
        assertEquals(5, //resultado esperado que me de el programa :3
                ContarVocales.contarVocales("AeIoU "));
    }

    @Test
    public void testSinVocales() {
        assertEquals(0,//resultado esperado que me de el programa :3
                ContarVocales.contarVocales("bcdfg"));
    }
}