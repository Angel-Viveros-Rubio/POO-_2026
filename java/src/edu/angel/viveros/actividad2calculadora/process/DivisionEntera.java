package edu.angel.viveros.actividad2calculadora.process;

/**
 * Clase DivisionEntera.
 * Realiza división entera usando restas.
 */
public class DivisionEntera {

    public int calcular(int a, int b) {
        if (b == 0) {
            return 0;
        }

        Resta resta = new Resta();
        int contador = 0;

        while (a >= b) {
            a = (int) resta.calcular(a, b);
            contador++;
        }
