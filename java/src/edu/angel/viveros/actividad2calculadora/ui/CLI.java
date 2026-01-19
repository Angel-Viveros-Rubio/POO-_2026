package edu.angel.viveros.actividad2calculadora.ui;

import java.util.Scanner;
import edu.angel.viveros.actividad2calculadora.process.*;

/**
 * Clase CLI.
 * Interacción con el usuario.
 */
public class CLI {

    public static void iniciar() {

        Scanner sc = new Scanner(System.in);
        int opcion;

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

        } while (opcion < 0 || opcion > 8);

        System.out.println("Programa finalizado");
    }
}

