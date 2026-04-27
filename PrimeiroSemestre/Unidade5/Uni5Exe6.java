package PrimeiroSemestre.Unidade5;

import java.util.Scanner;

public class Uni5Exe6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Descreva um algoritmo que leia a altura de 20 pessoas e calcule a média de altura das mesmas.

        double somaAltura = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a altura da pessoa " + i + ": ");
            double altura = scanner.nextDouble();
            somaAltura += altura;
        }
        double mediaAltura = somaAltura / 20;
        System.out.println("A média de altura das 20 pessoas é: " + mediaAltura);
        scanner.close();
    }
}
