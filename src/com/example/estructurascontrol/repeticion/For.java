package com.example.estructurascontrol.repeticion;

public class For {
    public static void main(String[] args) {
        for( int i = 0 ; i <= 10 ; i++ ){
            System.out.println("El valor de i es : " + i );
        }

        System.out.println("========================");
                            // 1         2          3
        String[] nombres = {"Pepe" , "Juanito", "Ruperta"};

        for (int i = 0 ; i < nombres.length; i++){ // length 3
            System.out.println(nombres[i]);
        }
        System.out.println("========================");
        int[] numeros = { 5 , 7 , 8 , 10 , 50};

        for (int i = 0 ; i < numeros.length; i++){ // length 3
            System.out.println(numeros[i]);
        }
        System.out.println("========================");
        int suma = 0;
        int[] num = { 5 , 7 , 8 , 10 , 50};

        for (int i = 0 ; i < numeros.length; i++){ // length 3
            suma = suma + numeros[i];
            System.out.println(suma);
        }
    }
}
