package edu.angel.viveros.actividad3.process;
/*
Programa que permite crear una lista de esa lista contar los numeros pares
 */
import java.util.List;

public class NumerosPares {

    public static int contarNumerosPares(List<Integer> numeros) {
        if (numeros == null || numeros.isEmpty()) {
            return 0;
        }
        int count = 0;
        for (Integer num : numeros) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}

