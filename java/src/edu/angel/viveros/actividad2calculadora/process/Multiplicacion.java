package edu.angel.viveros.actividad2calculadora.process;

/**
 * Clase Multiplicacion.
 * Multiplica usando sumas.
 */
public class Multiplicacion extends Suma {
    @Override
    public long calcular(long a, long b) {
        if (a == 0 || b == 0) return 0;

        boolean negativo = (a < 0) ^ (b < 0);  // XOR para signo
        long absA = a < 0 ? -a : a;
        long absB = b < 0 ? -b : b;

        long resultado = 0;
        long base = absA;

        while (absB > 0) {
            if ((absB & 1) == 1) {
                resultado = super.calcular(resultado, base);
            }
            base = super.calcular(base, base);
            absB >>= 1;
        }

        return negativo ? -resultado : resultado;
    }
}
