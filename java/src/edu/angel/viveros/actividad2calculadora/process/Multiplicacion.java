package edu.angel.viveros.actividad2calculadora.process;

/**
 * Clase Multiplicacion.
 * Multiplica usando sumas.
 */
public class Multiplicacion {

    public double calcular(double a, int b) {
        Suma suma = new Suma();
        double resultado = 0;
        int i = 0;

        if (b == 0) {
            return 0;
        }

        do {
            resultado = suma.calcular(resultado, a);
            i++;
        } while (i < b);

        return resultado;
    }
}
