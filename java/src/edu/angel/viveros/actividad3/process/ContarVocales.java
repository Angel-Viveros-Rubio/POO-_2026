package edu.angel.viveros.actividad3.process;

public class ContarVocales {
/** Se implementa una forma para que el cliente pueda meter los datos como una palabra y se guarde, ademas de
 * pasarlo a minuscula despues y verifican con un ciclo for.
 */
    public static int contarVocales(String texto) {
        if (texto == null) {
            return 0;
        }

        int contador = 0;
        String minusculas = texto.toLowerCase();  // para que cuente aunque tenga mayúsculas

        for (int i = 0; i < minusculas.length(); i++) {
            char letra = minusculas.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }
        return contador;
    }
}

