package com.example.herencia;

import com.example.clases.SmartDevice;

public class SmartWatch extends SmartDevice {
    public String genero;

    public SmartWatch() {
    }

    public SmartWatch(String size, String sistemaOperativo, String marca, double precio, String genero) {
        super(size, sistemaOperativo, marca, precio);
        this.genero = genero;
    }
}
