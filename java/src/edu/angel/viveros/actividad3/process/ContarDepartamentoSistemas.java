package edu.angel.viveros.actividad3.process;

import java.util.List;

public class ContarDepartamentoSistemas {
    /**
     * Cuenta cuántos empleados tienen "sistemas" en su departamento.
     * Si la lista es null devuelve 0.
     */
    public static int contarDepartamentoSistemas(List<Empleado> empleados) {
        if (empleados == null) {
            return 0;
        }

        int contador = 0;
        for (Empleado e : empleados) {
            if (e.Departamento != null && "sistemas".equalsIgnoreCase(e.Departamento)) {
                contador++;
            }
        }
        return contador;
    }
}
