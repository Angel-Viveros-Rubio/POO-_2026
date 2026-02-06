package edu.angel.viveros.actividad2calculadora.process;

/**
 * Clase Suma.
 * Contiene la lógica de la suma.
 */
public class Suma extends Operacion {
    @Override
    public long calcular(long a, long b) {
        return a + b;
    }
}