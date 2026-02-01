package edu.angel.viveros.actividad3.process;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
//  Este programa encuentra la edad que más se repite

public class EdadMasComun {
    public static int edadMasComun(List<Empleado> empleados) {
        if (empleados == null || empleados.isEmpty()) {
            return 0;
        }

        // Usamos el metodo maps visto en clase para generar un conteo que verificara cada edad
        Map<Integer, Integer> conteo = new HashMap<>();

        // Contamos
        for (Empleado e : empleados) {
            int edad = e.Edad;
            if (conteo.containsKey(edad)) {
                conteo.put(edad, conteo.get(edad) + 1);
            } else {
                conteo.put(edad, 1);
            }
        }

        // Ahora usando lo que se guardo anteriormente solo hay que buscar la edad que mas se repite pues ya tenemos tood guardado
        int edadComun = -1;
        int maxRepes = 0;

        for (Map.Entry<Integer, Integer> entry : conteo.entrySet()) {
            if (entry.getValue() > maxRepes) {
                maxRepes = entry.getValue();
                edadComun = entry.getKey();
            }
        }

        return edadComun;
    }

}
