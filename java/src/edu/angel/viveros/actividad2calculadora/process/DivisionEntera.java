package edu.angel.viveros.actividad2calculadora.process;

/**
 * Clase DivisionEntera.
 * Realiza división sin usar el operador /.
 */
public class DivisionEntera {

    public int calcular(int a, int b) {
        Resta resta = new Resta();
        int contador = 0;

        do {
            a = (int) resta.calcular(a, b);
            contador++;
        } while (a >= b);

        return contador;
    }
}
