package com.example.funciones;

/**
 * Soobrecarga permite duplicar un método siempre y cuando tengan diferente tipo/número de parámetros.
 */
public class Sobrecarga {
    public static void main(String[] args) {

        // Función anónima: Para pasar una función a otra función
        //() -> System.out.println("");
    }
    static int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }
    static int suma(int numero1, int numero2, int numero3) {
        return numero1 + numero2 + numero3;
    }
}
