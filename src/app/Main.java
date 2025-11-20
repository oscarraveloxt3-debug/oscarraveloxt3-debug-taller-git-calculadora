package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la Calculadora");

        Scanner sc = new Scanner(System.in);
        char continuar;

        do{
        System.out.println("==== CALCULADORA ====");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("Seleccione una opción: ");

        int opcion = sc.nextInt();

        double a, b, resultado;

        System.out.print("Ingrese primer número: ");
        a = sc.nextDouble();

        System.out.print("Ingrese segundo número: ");
        b = sc.nextDouble();

        switch (opcion) {
            case 1 -> resultado = a + b;
            case 2 -> resultado = a - b;
            case 3 -> resultado = a * b;
            case 4 -> {
                if (b == 0) {
                    System.out.println("Error: división por cero no permitida");
                    return;
                }
                resultado = a / b;
            }
            default -> {
                System.out.println("Opción inválida");
                return;
            }
        }

        System.out.println("Resultado: " + resultado);
            System.out.print("¿Deseas continuar? (s/n): ");
            continuar = sc.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');
    }





    }







