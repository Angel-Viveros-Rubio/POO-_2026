package edu.angel.viveros.actividad2calculadora.process;


/**
 * Clase Raiz.
 * Calcula la raíz cuadrada aproximada.
 */
public class Raiz {

    public int calcular(int numero) {
        Multiplicacion mult = new Multiplicacion();
        int i = 1;

        do {
            i++;
        } while (mult.calcular(i, i) <= numero);

        return i - 1;
    }
}
