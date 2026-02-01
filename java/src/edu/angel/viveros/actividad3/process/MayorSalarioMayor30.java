package edu.angel.viveros.actividad3.process;

import java.util.List;

public class MayorSalarioMayor30 {
    /**
     * Devuelve el empleado con el sueldo más alto entre los que tienen más de 30 años.
     * Si no hay ninguno mayor de 30 años, devuelve null.
     * Practicamente lo mismo que comparar un sueldo solo que con un if antes de la condicion, no cambia casi nada el codigo
     */
    public static Empleado mayorSalarioMayor30(List<Empleado> empleados) {
        if (empleados == null || empleados.isEmpty()) {
            return null;
        }

        Empleado candidato = null;

        for (Empleado e : empleados) {
            if (e.Edad > 30) {
                if (candidato == null || e.sueldo > candidato.sueldo) {
                    candidato = e;
                }
            }
        }

        return candidato;
    }
}

