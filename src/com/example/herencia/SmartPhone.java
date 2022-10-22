package com.example.herencia;

import com.example.clases.SmartDevice;

public class SmartPhone extends SmartDevice {
    public String gama;

    public SmartPhone(){

    }

    public SmartPhone(String size, String sistemaOperativo, String marca, double precio, String gama) {
        super(size, sistemaOperativo, marca, precio);
        this.gama = gama;
    }
}
