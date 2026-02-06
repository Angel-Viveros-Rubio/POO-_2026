package edu.angel.viveros.actividad2calculadora.ui;

import edu.angel.viveros.actividad2calculadora.process.*;

import java.util.Scanner;

public class CLI {
    private final Scanner scanner;
    private final Calculadora calculadora;

    public CLI() {
        scanner = new Scanner(System.in);
        calculadora = new Calculadora();  // El motor de cálculos
    }

    public void iniciar() {
        while (true) {
            mostrarMenu();
            int opcion = leerEntero("Seleccione una operación (1-9): ");

            if (opcion == 9) {
                System.out.println("¡Hasta luego!");
                break;
            }

            if (opcion < 1 || opcion > 8) {
                System.out.println("Opción inválida. Intente de nuevo.\n");
                continue;
            }

            long a = leerLong("Ingrese el primer número (a): ");
            long b = leerLong("Ingrese el segundo número (b): ");

            try {
                long resultado = calculadora.ejecutar(opcion, a, b);
                System.out.println("Resultado: " + resultado + "\n");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage() + "\n");
            }
        }
        scanner.close();
    }

    private void mostrarMenu() {
        System.out.println("=== CALCULADORA SIN * / % ===");
        System.out.println("1. Suma (a + b)");
        System.out.println("2. Resta (a - b)");
        System.out.println("3. Multiplicación (a * b)");
        System.out.println("4. Potencia (a^b)");
        System.out.println("5. Raíz (raíz b-ésima de a)");
        System.out.println("6. División entera (a / b)");
        System.out.println("7. Módulo (a % b)");
        System.out.println("8. Logaritmo entero (log_b(a))");
        System.out.println("9. Salir");
        System.out.println();
    }

    private int leerEntero(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor ingrese un número entero válido.");
            }
        }
    }

    private long leerLong(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                return Long.parseLong(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor ingrese un número entero válido.");
            }
        }
    }
}