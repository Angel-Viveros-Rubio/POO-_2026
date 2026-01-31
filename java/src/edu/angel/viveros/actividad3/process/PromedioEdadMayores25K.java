package edu.angel.viveros.actividad3.process;

import java.util.List;

public class PromedioEdadMayores25K {
    public static double calcularPromedioEdadMayores25K(List<Empleado> empleados) {
        /*
         * Calcula el promedio de edad de los empleados que tienen sueldo mayor a 25000.
         * Si no hay ninguno que gane más de 25K, o la lista está vacía/null, devuelve 0.
         */
        if (empleados == null || empleados.isEmpty()) {
            return 0.0;
        }

        int sumaEdades = 0;
        int contador = 0;
//aqui se comprueba si es que gana mas de 25K o es pobre
        for (Empleado e : empleados) {
            if (e.sueldo > 25000) {
                sumaEdades = sumaEdades + e.Edad;
                contador++;
            }
        }

        if (contador == 0) {
            return 0.0;
        }

        return (double) sumaEdades / contador;
    }

}

