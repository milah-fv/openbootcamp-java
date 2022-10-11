package com.example;

public class Funciones {
    public static void main(String[] args) {



        // Opción 1: Función sin parámetros y sin tipo de retorno
        showMenu();
        showMenu();

        // Opción 2: Función sin parámetros y con tipo de retorno
        String menu = getMenu();
        System.out.println(menu);
        System.out.println(getMenu());
        
        double price = getPrice();
        System.out.println(price);

        // Opción 3: Función con parámetros y sin tipo de retorno

        imprimirSaludoBuenosDias("OpenBootcamp");

        // Opción 4: Función con parámetros y con tipo de retorno
        String nombre = "Alan";
        String apellido = "Sastre";
        String saludo = obtenerSaludo(nombre, apellido);
        System.out.println(saludo);

        int resultadoSuma1 = suma(50, 200);
        int resultadoSuma2 = suma(150, 250);
        int resultadoSuma3 = suma(50, 600);
        int resultadoSuma4 = suma(50, 100);
    }

    static int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    /**
     * void indica que no devuelve nada
     */
    static void showMenu(){

        System.out.println("Bienvenidos al e-commerce de zapatillas: ");
        System.out.println("1 - Ver zapatillas ");
        System.out.println("2 - Comprar zapatillas ");
        System.out.println("3 - Salir ");

    }

    static String getMenu(){
        return "Bienvenidos al e-commerce de zapatillas: \n 1 - Ver zapatillas ....";
    }

    static double getPrice() {
        return 100.99;
    }

    static void imprimirSaludoBuenosDias(String nombre){
        System.out.println("Buenas tardes " + nombre);
    }

    static String obtenerSaludo(String nombre, String apellido){
        return  "Buenas tardes " + nombre + " " + apellido;
    }
}
