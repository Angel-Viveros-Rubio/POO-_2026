package edu.angel.viveros.actividad3.process;

import java.util.ArrayList;
import java.util.List;

public class MenoresDe25 {
/**
 * Genera y devuelve una lista con solo los empleados que tienen menos de 25 años.
 * Si no hay ninguno, devuelve lista vacía.
 */
    public static List<Empleado> filtrarMenoresDe25(List<Empleado> empleados) {
        List<Empleado> menores = new ArrayList<>();

        if (empleados == null) {
            return menores;  // osea no guarda nada
        }

        for (Empleado e : empleados) {
            if (e.Edad < 25) {
                menores.add(e);
            }
        }

        return menores;
    }
}
