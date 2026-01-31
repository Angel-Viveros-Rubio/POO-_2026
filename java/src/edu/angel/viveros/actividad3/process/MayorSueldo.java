package edu.angel.viveros.actividad3.process;

import java.util.List;
/*
Programa que permite usar a Empleados para calcular cual empleado gana mas dinero con una comparacion con un ciclo for
 */
public class MayorSueldo {
    public static Empleado mayorSueldo(List<Empleado> empleados) {
        if (empleados == null || empleados.isEmpty()) {
            return null;
        }

        Empleado elMejor = empleados.get(0);  // Agarro al primero de la lista

        for (Empleado e : empleados) {
            if (e.sueldo > elMejor.sueldo) {
                elMejor = e;
            }
        }
        return elMejor;
    }
}

