package com.example.clases;

import com.example.herencia.SmartPhone;
import com.example.herencia.SmartWatch;

public class MainDevice {
    public static void main(String[] args) {

        SmartPhone iphone = new SmartPhone("mini", "ios", "apple", 3500.99, "alta");
        System.out.println("======= SmartPhone =====");
        System.out.println(iphone.size);
        System.out.println(iphone.sistemaOperativo);
        System.out.println(iphone.marca);
        System.out.println(iphone.precio);
        System.out.println(iphone.gama);

        SmartWatch reloj = new SmartWatch("pulsera", "android", "LG", 155.50, "unisex");
        System.out.println("======= SmartWatch =====");
        System.out.println(reloj.size);
        System.out.println(reloj.sistemaOperativo);
        System.out.println(reloj.marca);
        System.out.println(reloj.precio);
        System.out.println(reloj.genero);
    }
}
