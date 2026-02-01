package edu.angel.viveros.actividad3.process;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenorSalarioEdadMenosComun {
    /**
     * Clase que busca al empleado con menor sueldo que tenga la edad menos común.
     */
    public static Empleado menorSalarioEdadMenosComun(List<Empleado> empleados) {
        if (empleados == null || empleados.isEmpty()) {
            return null;
        }

        // Se cuente cuántas veces aparece cada edad
        Map<Integer, Integer> conteo = new HashMap<>();
        for (Empleado e : empleados) {
            int edad = e.Edad;
            // Si ya está la edad, suma 1.
            if (conteo.containsKey(edad)) {
                conteo.put(edad, conteo.get(edad) + 1);
            } else {
                conteo.put(edad, 1);
            }
        }

        //  Se busca cual es la edad menos común
        int menosVeces = Integer.MAX_VALUE;
        for (int veces : conteo.values()) {
            if (veces < menosVeces) {
                menosVeces = veces;
            }
        }

        //  Se Busca el empleado con menor sueldo
        Empleado elElegido = null;
        int sueldoMasBajo = Integer.MAX_VALUE;

        for (Empleado e : empleados) {
            int vecesQueAparece = conteo.get(e.Edad);
            if (vecesQueAparece == menosVeces) {
                if (e.sueldo < sueldoMasBajo) {
                    sueldoMasBajo = e.sueldo;
                    elElegido = e;
                }
            }
        }

        return elElegido;
    }
}
