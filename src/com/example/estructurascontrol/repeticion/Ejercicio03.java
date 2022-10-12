package com.example.estructurascontrol.repeticion;

public class Ejercicio03 {
    public static void main(String[] args) {
        String[] datos = {"Ana", "Paula", "Roxana", "Carla", "Maria"};
        int cantidad = datos.length;
        String concatenar = "";
        for (int i=0; i < datos.length; i++){
            if (i == 0){
                concatenar = datos[0];
                System.out.print(concatenar);
                continue;
            }
            if (i - cantidad  == -1){
                concatenar = " y " + datos[i];
                System.out.print(concatenar);
                continue;
            }
            concatenar = ", " + datos[i];
            System.out.print(concatenar);
        }
    }
}
