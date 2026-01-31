package edu.angel.viveros.actividad3.test;

import edu.angel.viveros.actividad3.process.MoverCerosALaDerecha;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoverCerosALaDerechaTest {

    @Test
    public void mover_cero_happy_path_Test() {
        //LO que se ingresa
        List<Integer> lista = new ArrayList<>(Arrays.asList(0, 2, 1, 4, 0, 2));

        MoverCerosALaDerecha.moverCerosALaDerecha(lista);

        assertEquals(Arrays.asList(2, 1, 4, 2, 0, 0), lista);
    }

    @Test
    public void testListaVacia() {
        List<Integer> lista = new ArrayList<>();

        MoverCerosALaDerecha.moverCerosALaDerecha(lista);

        assertTrue(lista.isEmpty());
    }

}