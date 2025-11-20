package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char continuar = 0;

        do {
            System.out.println("\n==== CALCULADORA ====");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();

            System.out.print("Ingrese primer número: ");
            double a = sc.nextDouble();

            System.out.print("Ingrese segundo número: ");
            double b = sc.nextDouble();

            double resultado;

            switch (opcion) {
                case 1 -> resultado = a + b;
                case 2 -> resultado = a - b;
                case 3 -> resultado = a * b;
                case 4 -> {
                    if (b == 0) {
                        System.out.println("Error: división por cero");
                        continue;
                    }
                    resultado = a / b;
                }
                default -> {
                    System.out.println("Opción inválida");
                    continue;
                }
            }

            System.out.println("Resultado: " + resultado);

            System.out.print("¿Deseas continuar? (s/n): ");
            continuar = sc.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        System.out.println("Gracias por usar la calculadora");
    }


    }







