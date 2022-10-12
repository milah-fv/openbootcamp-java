package com.example.estructurascontrol.repeticion;

public class ForEach {
    public static void main(String[] args) {

        String[] nombres = {"Pepe" , "Juanito", "Ruperta"};
        for (String nombre: nombres){
            System.out.println(nombre);
        }

        int[] numeros = { 5 , 7 , 8 , 10 , 50};
        int suma = 0;
        for (int numero: numeros){
            suma += numero;

        }
        System.out.println(suma);
    }
}
