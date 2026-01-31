package edu.angel.viveros.actividad3.process;

import java.util.List;
/**
 * En este programa lo que se hace es simplemente sacar un promedio de la edad, sumando
 * y dividiendo.
 */
public class PromedioEdad {

    /**
     * Calcule el promedio de las edades de los empleados en la lista.
     */
    public static double calcularPromedioEdad(List<Empleado> empleados) {
        if (empleados == null || empleados.isEmpty()) {
            return 0.0;
        }

        int suma = 0;
        for (Empleado e : empleados) {
            suma = suma + e.Edad;
        }

        return (double) suma / empleados.size();
    }
}