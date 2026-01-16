package edu.angel.viveros.actividad1poo.process;

import edu.angel.viveros.actividad1poo.models.Auto;
import java.time.LocalDate;

/**
 * Clase Ticket.
 * Se encarga de gestionar la venta de vehículos.
 * Calcula el total a pagar y genera la información del ticket.
 */
public class Ticket {

    private String nombreCliente;
    private double total;
    private LocalDate fecha;

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
    }

    /**
     * Genera el contenido del ticket de venta.
     *
     * @return ticket en formato de texto
     */
    public String generarTicket() {
        return "===== TICKET DE VENTA =====\n"
                + "Cliente: " + nombreCliente + "\n"
                + "Fecha: " + fecha + "\n"
                + "Total a pagar: $" + total;
    }

    /**
     * Devuelve el total de la compra.
     *
     * @return total a pagar
     */
    public double getTotal() {
        return total;
    }
}

