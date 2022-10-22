package com.example.clases;

public class SmartDevice {
    protected String size;
    protected String sistemaOperativo;
    protected String marca;
    protected double precio;

    public SmartDevice(){

    }

    public SmartDevice(String size, String sistemaOperativo, String marca, double precio){
        this.size = size;
        this.sistemaOperativo = sistemaOperativo;
        this.marca = marca;
        this.precio = precio;

    }
}
