package edu.angel.viveros.actividad1poo.models;


public class Auto {

    String marca;
    String modelo;
    double precio;

    public Auto(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }


    public void mostrarInfo() {
        System.out.println(marca + " " + modelo + " - $" + precio);
    }
}