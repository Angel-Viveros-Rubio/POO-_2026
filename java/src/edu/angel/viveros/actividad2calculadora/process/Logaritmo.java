package edu.angel.viveros.actividad2calculadora.process;

/**
 * Clase Logaritmo.
 * Calcula logaritmo entero usando divisiones.
 */
public class Logaritmo extends DivisionEntera {
    @Override
    public long calcular(long a, long base) {
        if (a <= 1 || base <= 1 || base == 1) return 0;

        long valor = a;
        long log = 0;

        while (valor >= base) {
            valor = super.calcular(valor, base);
            log++;
        }
        return log;
    }
}
