package com.example.estructurascontrol.condicionales;

public class IfElseIf {
    public static void main(String[] args) {
        String dia = "Domingo";

        // Ejemplos comparar
        boolean resultadoComparNum = 5 == 5;
        boolean resultado = dia.equals("Martes");

        // if else if
        if (dia.equals("Lunes")) {
            System.out.println("Animo con la semana");

        } else if (dia.equals("Martes")) {
            System.out.println("Martes con M");

        } else if (dia.equals("Miercoles")) {
            System.out.println("Miercoles con M");

        } else if (dia.equals("Jueves")) {
            System.out.println("Jueves con J");

        } else if (dia.equals("Viernes")) {
            System.out.println("Ya casi");

        } else if (dia.equals("Sabado")) {
            System.out.println("Al fin");

        } else if (dia.equals("Domingo")) {
            System.out.println("Y se termino");

        } else {
            System.out.println("Día no válido");
        }


    }
}
