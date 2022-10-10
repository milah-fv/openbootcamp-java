package com.example;

public class Operadores {
    public static void main(String[] args) {
        // Aritmeticos
        int numero1 = 10;
        int numero2 = 20;
        int resultadoSuma = numero1 + numero2;

        System.out.println(resultadoSuma);
        System.out.println(resultadoSuma + 5.77);

        int resultadoResta = numero1 - numero2;

        /*
        comparación:
        > mayor
        < menor
        >= mayor que
        <= menor que
        == igual que
         */

        boolean resultado1 = numero1 > numero2; // false
        System.out.println(resultado1);
        boolean resultado2 = numero1 < numero2; // true
        System.out.println(resultado2);

        /*
        Lógicos
        And &&
        Or ||
         */
        boolean resultado3 = numero1 > 5 && numero1 < 30;
        int edad = 17;
        boolean carneJoven = edad >= 15 && edad <= 26;


    }
}
