package edu.angel.viveros.actividad3.process;

public class InvertirCadena {
/**
 * Clase que invierte una cadena sin usar reverse().
 * Devuelve la cadena invertida.
 * Si el texto es null, devuelve null.
 * Si es vacía, devuelve vacía.
 */
    public static String invertirCadena(String texto) {
        if (texto == null) {
            return null;
        }

        StringBuilder invertida = new StringBuilder();
// De atrás para adelante
        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida.append(texto.charAt(i));
        }

        return invertida.toString();
    }
}

