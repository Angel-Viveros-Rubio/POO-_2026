package edu.angel.viveros.actividad1poo.process;

import edu.angel.viveros.actividad1poo.models.Auto;

import java.time.LocalDate;


public class Ticket {
    /**
     * Clase Ticket.
     * Se encarga de gestionar la venta de vehículos.
     * Calcula el total a pagar y muestra el ticket final.
     */
    String nombreCliente;
    double total;
    LocalDate fecha;

    /**
     * Constructor de la clase Ticket.
     *
     * @param nombreCliente nombre del cliente
     */

    public Ticket(String nombreCliente) {
        this.nombreCliente = nombreCliente;
        this.total = 0;
        this.fecha = LocalDate.now();
    }
    /**
     * Agrega un vehículo al ticket y suma su precio al total.
     *
     * @param auto vehículo seleccionado por el cliente
     */

    public void agregarAuto(Auto auto) {
        total += auto.precio;
        System.out.println("Agregado: " + auto.marca + " " + auto.modelo);
    }
    /**
     * Muestra el ticket de venta con los datos finales.
     */

    public void mostrarTicket() {
        System.out.println("\n===== TICKET DE VENTA =====");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Fecha: " + fecha);
        System.out.println("Total a pagar: $" + total);
    }
}
