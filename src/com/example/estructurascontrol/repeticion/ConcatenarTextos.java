package com.example.estructurascontrol.repeticion;

public class ConcatenarTextos {
    public static void main(String[] args) {
        String[] nombres = {"Ana", "Paula", "Roxana"};
        int cantidad = nombres.length;
        int i = 0;
        String concatenar = "";
        for (String nombre : nombres) {
            // Si es el primer elemento, que no lleve "coma"
            if (i == 0) {
                concatenar = concatenar + nombre;
                i++;
                continue;

            }
            // Si es el último elemento, que lleve " y "
            if (i - cantidad == -1) {
                concatenar = concatenar + " y " + nombre;
                continue;
            }
            i++;
            // Al resto, complementarlo con comas
            concatenar = concatenar + ", " + nombre;

        }
        System.out.println(concatenar);
    }
}
