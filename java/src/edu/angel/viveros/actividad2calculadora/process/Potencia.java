package edu.angel.viveros.actividad2calculadora.process;

/**
 * Clase Potencia.
 * Calcula una potencia usando multiplicaciones.
 */
public class Potencia {

    public double calcular(double base, int exponente) {
        Multiplicacion mult = new Multiplicacion();
        double resultado = 1;
        int i = 0;

        do {
            resultado = mult.calcular(resultado, (int) base);
            i++;
        } while (i < exponente);

        return resultado;
    }
}
