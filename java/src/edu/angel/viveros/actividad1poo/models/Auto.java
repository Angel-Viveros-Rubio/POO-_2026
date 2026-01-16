package edu.angel.viveros.actividad1poo.models;


public class Auto {

    /**
     * Clase Auto.
     * Representa un vehículo disponible para la venta.
     * Contiene la información básica del automóvil.
     */

    public String marca;
    public String modelo;
    public double precio;


    /**
     * Constructor de la clase Auto.
     *
     * @param marca  marca del vehículo
     * @param modelo modelo del vehículo
     * @param precio precio del vehículo
     */

    public Auto(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }


    public void mostrarInfo() {
        System.out.println(marca + " " + modelo + " - $" + precio);
    }
}