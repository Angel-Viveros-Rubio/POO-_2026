package edu.angel.viveros.actividad3.process;
import java.util.List;
/*
Clase que calcula el promedio de salario de una lista de empleados.
 */
public class PromedioSalario {

    public static double calcularPromedioSalario(List<Empleado> empleados) {
        if (empleados == null || empleados.isEmpty()) {
            return 0.0;
        }

        int suma = 0;
        for (Empleado e : empleados) {
            suma = suma + e.sueldo;
        }

        return (double) suma / empleados.size();
    }
}

