package edu.angel.viveros.actividad2calculadora.process;

/**
 * Clase DivisionEntera.
 * Realiza división entera usando restas.
 */
public class DivisionEntera extends Resta {
    @Override
    public long calcular(long a, long b) {
        if (b == 0) throw new ArithmeticException("División por cero");

        boolean negativo = (a < 0) != (b < 0);
        long absA = a < 0 ? -a : a;
        long absB = b < 0 ? -b : b;

        long cociente = 0;
        while (absA >= absB) {
            absA = super.calcular(absA, absB);
            cociente++;
        }

        return negativo ? -cociente : cociente;
    }
}