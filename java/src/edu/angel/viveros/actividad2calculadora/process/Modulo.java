package edu.angel.viveros.actividad2calculadora.process;

/**
 * Clase Modulo.
 * Calcula el residuo de una división sin usar el operador %.
 * Se apoya en la clase Resta.
 */
public class Modulo {

    /**
     * Calcula el módulo entre dos números enteros.
     *
     * @param a dividendo
     * @param b divisor
     * @return residuo de la división
     */
    public int calcular(int a, int b) {

        if (b == 0) {
            System.out.println("No se puede calcular módulo entre 0");
            return 0;
        }

        Resta resta = new Resta();
        int resultado = a;

        // Mientras el resultado siga siendo mayor o igual al divisor
        do {
            if (resultado < b) {
                break;
            }
            resultado = (int) resta.calcular(resultado, b);
        } while (resultado >= b);

        return resultado;
    }
}
