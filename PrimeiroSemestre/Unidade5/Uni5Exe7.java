package PrimeiroSemestre.Unidade5;

import java.util.Scanner;

public class Uni5Exe7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Descreva um algoritmo que leia um número inteiro n e, dados n números reais informe o maior e o menor número

        System.out.print("Digite a quantidade de números: ");
        int n = scanner.nextInt();

        double maior = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o número " + i + ": ");
            double num = scanner.nextDouble();

            if (num > maior) {
               maior = num;
            }
            if (num < menor) {
                menor = num;
            }
        }
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        scanner.close();
    }
}
