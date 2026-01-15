package edu.angel.viveros.actividad1poo.models;


public class Auto {

    public String marca;
    public String modelo;
    public double precio;

    public Auto(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }


    public void mostrarInfo() {
        System.out.println(marca + " " + modelo + " - $" + precio);
    }
}