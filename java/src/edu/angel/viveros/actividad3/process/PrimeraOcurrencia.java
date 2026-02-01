package edu.angel.viveros.actividad3.process;

public class PrimeraOcurrencia {
    /**
     * Devuelve la posición de la primera vez que aparece el carácter.
     * Si no lo encuentra, devuelve -1.
     */
    public static int primeraOcurrencia(String texto, char caracter) {
        if (texto == null) {
            return -1;
        }

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == caracter) {
                return i;
            }
        }

        return -1;
    }
}
