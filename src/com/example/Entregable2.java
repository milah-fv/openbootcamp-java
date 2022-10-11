package com.example;

public class Entregable2 {
    public static void main(String[] args) {
        double monto = 100;
        double precioFinal = precio(monto);
        System.out.println("El total a pagar es $ " + precioFinal);
    }

    private static double precio(double monto) {
        return (monto / 100) * 122;
    }
}
