package edu.angel.viveros.actividad2calculadora.process;

/**
 * Clase Modulo.
 * Obtiene el residuo usando restas.
 */
public class Modulo {

    public int calcular(int a, int b) {
        Resta resta = new Resta();

        do {
            a = (int) resta.calcular(a, b);
        } while (a >= b);

        return a;
    }
}
