package edu.angel.viveros.actividad3.process;

public class EsPalindromo {
    /**
     * Determina si una cadena es un palíndromo.
     * Se ignora mayúsculas/minúsculas
     * Se consideran todos los caracteres, incluyendo espacios y signos de puntuación.
     */
    public static boolean esPalindromo(String texto) {
        if (texto == null || texto.isEmpty()) {
            return true; // vacío o null se considera palíndromo
        }
        String lower = texto.toLowerCase();
        int izquierda = 0;
        int derecha = lower.length() - 1;

        while (izquierda < derecha) {
            if (lower.charAt(izquierda) != lower.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }
        return true;
    }
}
