package edu.angel.viveros.actividad2calculadora.process;

/**
 * Clase Resta.
 * Contiene la lógica de la resta.
 */
public class Resta extends Operacion {
    @Override
    public long calcular(long a, long b) {
        return a - b;
    }
}