
package com.inventario;

public class App {

    public static int calcularResta(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static void main(String[] args) {
        int numero1 = 210;
        int numero2 = 125;

        int resultado = calcularResta(numero1, numero2);

        System.out.println("Primer número: " + numero1);
        System.out.println("Segundo número: " + numero2);
        System.out.println("Resultado de la resta: " + resultado);
    }
}