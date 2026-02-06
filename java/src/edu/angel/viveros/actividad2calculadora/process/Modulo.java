package edu.angel.viveros.actividad2calculadora.process;

/**
 * Clase Modulo.
 * Calcula el residuo de una división sin usar el operador %.
 * Se apoya en la clase Resta.
 */
public class Modulo extends Resta {
    @Override
    public long calcular(long a, long b) {
        if (b == 0) throw new ArithmeticException("División por cero");

        long absB = b < 0 ? -b : b;
        long resto = a < 0 ? -a : a;

        while (resto >= absB) {
            resto = super.calcular(resto, absB);
        }

        if (a < 0) {
            resto = -resto;
        }
        return resto;
    }
}