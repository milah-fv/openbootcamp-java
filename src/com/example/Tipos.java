package com.example;

public class Tipos {
    public static void main(String[] args) {

        //1. numericos

        //1.1 enteros de menor a mayor capacidad
        byte variable1 = 5;
        short variable2 = 10;
        int variable3 = 30;
        long variable4 = 100;

        //1.2 decimales
        float variable5 = 5.6f; // Menor capacidad
        double variable6 = 10.5d; // Mayor capacidad
        double precioSilla = 49.99;

        //2. booleanos
        boolean variable7 = false;
        boolean variable8 = true;

        //3. texto
        char variable9 = 'a';
        String variable10 = "Lorem ipsum bla bla bla";


        System.out.println(variable1);
        System.out.println(variable2);
        System.out.println(variable3);
        System.out.println(variable4);
        System.out.println(variable5);
        System.out.println(variable6);
        System.out.println(variable7);
        System.out.println(variable8);
        System.out.println(variable9);
        System.out.println(variable10);
        System.out.println(precioSilla);


    }


}
