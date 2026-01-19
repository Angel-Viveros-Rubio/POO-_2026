package edu.angel.viveros.actividad2calculadora.process;

/**
 * Clase Logaritmo.
 * Calcula un logaritmo usando divisiones.
 */
public class logaritmo {

    public int calcular(int numero, int base) {
        DivisionEntera div = new DivisionEntera();
        int contador = 0;

        do {
            numero = div.calcular(numero, base);
            contador++;
        } while (numero >= base);

        return contador;
    }
}
