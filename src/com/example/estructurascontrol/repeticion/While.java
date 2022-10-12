package com.example.estructurascontrol.repeticion;


public class While {
    public static void main(String[] args) {

        int contador = 0;

        while(contador < 10){
            String nombre = "Prueba";

            contador++;

            if (contador == 5) {
                // break;   // Interrumpe la operación
                continue;   // Continúa con la operación ignorando el 5
            }
            System.out.println("Valor de contador " + contador);
        }
        // La variable nombre está fuera del ámbito donde se creó
        //System.out.println(nombre);
    }
}
