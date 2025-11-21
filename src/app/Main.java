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
            System.out.println("5. Raíz cuadrada");

            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();

            double a = 0, b = 0;

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese primer número: ");
                a = sc.nextDouble();

                System.out.print("Ingrese segundo número: ");
                b = sc.nextDouble();
            } else if (opcion == 5) {
                System.out.print("Ingrese un número: ");
                a = sc.nextDouble();
            }

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
                case 5 -> {
                    if (a < 0) {
                        System.out.println("Error: no se puede sacar raíz de un número negativo");
                        continue;
                    }
                    resultado = Math.sqrt(a);
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








