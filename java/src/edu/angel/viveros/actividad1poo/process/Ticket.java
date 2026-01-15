package edu.angel.viveros.actividad1poo.process;

import edu.angel.viveros.Actividad1_.Process.Auto;

import java.time.LocalDate;


public class Ticket {

    String nombreCliente;
    double total;
    LocalDate fecha;


    public Ticket(String nombreCliente) {
        this.nombreCliente = nombreCliente;
        this.total = 0;
        this.fecha = LocalDate.now();
    }


    public void agregarAuto(Auto auto) {
        total += auto.precio;
        System.out.println("Agregado: " + auto.marca + " " + auto.modelo);
    }


    public void mostrarTicket() {
        System.out.println("\n===== TICKET DE VENTA =====");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Fecha: " + fecha);
        System.out.println("Total a pagar: $" + total);
    }
}
