package Unidade4;

import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        if (valor1 > valor2) {
            System.out.print("O valor " + valor1 + " é maior que o valor " + valor2);
        } else {
            System.out.print("O valor " + valor2 + " é maior que o valor " + valor1);
        }

        scanner.close();
    }
}
