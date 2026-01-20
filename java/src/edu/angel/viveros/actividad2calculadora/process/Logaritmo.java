package edu.angel.viveros.actividad2calculadora.process;

/**
 * Clase Logaritmo.
 * Calcula logaritmo entero usando divisiones.
 */
public class Logaritmo {

    public int calcular(int numero, int base) {
        if (numero <= 0 || base <= 1) {
            return 0;
        }

        DivisionEntera div = new DivisionEntera();
        int contador = 0;

        do {
            numero = div.calcular(numero, base);
            contador++;
        } while (numero >= base);

        return contador;
    }
}

