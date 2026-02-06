package edu.angel.viveros.actividad2calculadora.process;


/**
 * Clase Raiz.
 * Calcula la raíz cuadrada aproximada.
 */
public class Raiz extends Potencia {
    @Override
    public long calcular(long numero, long indice) {
        if (indice <= 0) throw new IllegalArgumentException("Índice debe ser > 0");
        if (numero < 0) throw new IllegalArgumentException("Raíz de negativo no soportada");
        if (numero == 0 || numero == 1) return numero;

        long low = 1;
        long high = numero;
        long mejor = 0;

        while (low <= high) {

            long mid = low + ((high - low) >> 1);

            long potencia = elevar(mid, indice);

            if (potencia == numero) {
                return mid;
            }
            else if (potencia < 0 || potencia > numero) {
                high = super.calcular(mid, -1);
            }
            else {
                mejor = mid;
                low = super.calcular(mid, 1);
            }
        }
        return mejor;
    }

    private long elevar(long base, long exp) {
        return super.calcular(base, exp);
    }
}