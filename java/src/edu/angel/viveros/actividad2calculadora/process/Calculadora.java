package edu.angel.viveros.actividad2calculadora.process;

import java.util.HashMap;
import java.util.Map;

public class Calculadora {
    private final Map<Integer, Operacion> operaciones;

    public Calculadora() {
        operaciones = new HashMap<>();
        // Registro de todas las operaciones disponibles
        operaciones.put(1, new Suma());
        operaciones.put(2, new Resta());
        operaciones.put(3, new Multiplicacion());
        operaciones.put(4, new Potencia());          // a^b
        operaciones.put(5, new Raiz());              // raíz b-ésima de a
        operaciones.put(6, new DivisionEntera());
        operaciones.put(7, new Modulo());            // a % b
        operaciones.put(8, new Logaritmo());         // log_b(a)
    }

    public long ejecutar(int opcion, long a, long b) {
        Operacion op = operaciones.get(opcion);
        if (op == null) {
            throw new IllegalArgumentException("Opción inválida: " + opcion);
        }
        return op.calcular(a, b);
    }

    public boolean esOpcionValida(int opcion) {
        return operaciones.containsKey(opcion);
    }
}