package edu.angel.viveros.actividad1poo.ui;

import edu.angel.viveros.actividad1poo.models.Auto;
import edu.angel.viveros.actividad1poo.process.Ticket;
import java.util.Scanner;

/**
 * Clase CLI.
 * Controla toda la interacción con el usuario por consola.
 */
public class CLI {

    /**
     * Inicia el flujo principal del programa.
     * Solicita los datos del usuario y controla el menú de selección.
     */
    public static void iniciar() {

        Scanner sc = new Scanner(System.in);

        Auto a1 = new Auto("Toyota", "Corolla", 350000);
        Auto a2 = new Auto("Nissan", "Versa", 320000);
        Auto a3 = new Auto("Volkswagen", "Tera", 427000);

        System.out.println("=== AUTOS DISPONIBLES ===");
        System.out.println("1. " + a1.getInfo());
        System.out.println("2. " + a2.getInfo());
        System.out.println("3. " + a3.getInfo());

        System.out.print("\nNombre del cliente: ");
        String nombre = sc.nextLine();

        Ticket ticket = new Ticket(nombre);

        int opcion;
        do {
            System.out.print("Elige auto (1,2,3) o 0 para salir: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                ticket.agregarAuto(a1);
                System.out.println("Auto agregado.");
            } else if (opcion == 2) {
                ticket.agregarAuto(a2);
                System.out.println("Auto agregado.");
            } else if (opcion == 3) {
                ticket.agregarAuto(a3);
                System.out.println("Auto agregado.");
            }

        } while (opcion != 0);

        System.out.println();
        System.out.println(ticket.generarTicket());
    }
}
