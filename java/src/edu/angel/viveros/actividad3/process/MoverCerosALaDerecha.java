package edu.angel.viveros.actividad3.process;
import java.util.List;

public class MoverCerosALaDerecha {
    public static void moverCerosALaDerecha(List<Integer> numeros) {
        if (numeros == null || numeros.isEmpty()) {
            return;
        }

        int j = 0; // posición donde colocar el siguiente número que no sea cero

        // se recorre la lista para ir ingresando numeros de la lista
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) != 0) {
                if (i != j) {
                    // se mueve el número no cero a la posición j
                    numeros.set(j, numeros.get(i));
                    // ponemos cero en la posición original
                    numeros.set(i, 0);
                }
                j++; // avanzamos la posición para el próximo no cero
            }
        }
    }

}