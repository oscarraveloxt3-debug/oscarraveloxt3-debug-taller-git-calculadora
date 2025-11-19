package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== CALCULADORA ===");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            if (opcion == 0) break;

            System.out.print("Ingrese número 1: ");
            double a = sc.nextDouble();
            System.out.print("Ingrese número 2: ");
            double b = sc.nextDouble();

            double resultado = 0;

            switch (opcion) {
                case 1 -> resultado = a + b;
                case 2 -> resultado = a - b;
                case 3 -> resultado = a * b;
                case 4 -> resultado = b != 0 ? a / b : Double.NaN;
                default -> System.out.println("Opción inválida");
            }

            System.out.println("Resultado: " + resultado);

        } while (opcion != 0);

        System.out.println("Hasta luego!");
    }
}
