package edu.angel.viveros.actividad2calculadora.ui;

import edu.angel.viveros.actividad2calculadora.process.*;
import java.util.Scanner;

/**
 * Clase CLI.
 * Se encarga de la interacción con el usuario mediante la consola.
 * Muestra el menú de opciones y ejecuta las operaciones seleccionadas.
 */
public class CLI {

    /**
     * Método que inicia la ejecución de la calculadora.
     * Contiene el menú principal y controla el flujo del programa.
     */
    public static void iniciar() {

        Scanner sc = new Scanner(System.in);
        int opcion;

        // Instancias de las clases de operaciones
        Suma suma = new Suma();
        Resta resta = new Resta();
        Multiplicacion multiplicacion = new Multiplicacion();
        DivisionEntera division = new DivisionEntera();
        Modulo modulo = new Modulo();
        Potencia potencia = new Potencia();
        Raiz raiz = new Raiz();
        Logaritmo logaritmo = new Logaritmo();

        do {
            System.out.println("\n=== CALCULADORA ===");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División entera");
            System.out.println("5. Módulo");
            System.out.println("6. Potencia");
            System.out.println("7. Raíz");
            System.out.println("8. Logaritmo");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();

            if (opcion == 0) {
                System.out.println("Programa finalizado");
                break;
            }

            System.out.print("Ingresa el primer número: ");
            double num1 = sc.nextDouble();

            System.out.print("Ingresa el segundo número: ");
            double num2 = sc.nextDouble();

            double resultado;

            switch (opcion) {
                case 1:
                    resultado = suma.calcular(num1, num2);
                    break;

                case 2:
                    resultado = resta.calcular(num1, num2);
                    break;

                case 3:
                    resultado = multiplicacion.calcular(num1, (int) num2);
                    break;

                case 4:
                    resultado = division.calcular((int) num1, (int) num2);
                    break;

                case 5:
                    resultado = modulo.calcular((int) num1, (int) num2);
                    break;

                case 6:
                    resultado = potencia.calcular(num1, (int) num2);
                    break;

                case 7:
                    resultado = raiz.calcular((int) num1);
                    break;

                case 8:
                    resultado = logaritmo.calcular((int) num1, (int) num2);
                    break;

                default:
                    System.out.println("Opción no válida");
                    continue;
            }

            System.out.println("Resultado: " + resultado);

        } while (opcion != 0);

        sc.close();
    }
}


