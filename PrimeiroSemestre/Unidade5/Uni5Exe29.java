package PrimeiroSemestre.Unidade5;

import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {

            System.out.print("Digite o valor a ser sacado: ");
            int valor = scanner.nextInt();

            int cedulas20 = valor / 20;
            valor %= 20;

            int cedulas10 = valor / 10;
            valor %= 10;

            int cedulas5 = valor / 5;
            valor %= 5;

            int cedulas2 = valor / 2;
            valor %= 2;

            int cedulas1 = valor;

            System.out.println("Cédulas de 20: " + cedulas20);
            System.out.println("Cédulas de 10: " + cedulas10);
            System.out.println("Cédulas de 5: " + cedulas5);
            System.out.println("Cédulas de 2: " + cedulas2);
            System.out.println("Cédulas de 1: " + cedulas1);

            System.out.print("Deseja realizar outro saque? (s/n): ");
            continuar = scanner.next();
        }

        scanner.close();
    }
}