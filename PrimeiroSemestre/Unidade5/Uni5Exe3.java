package PrimeiroSemestre.Unidade5;

import java.util.Scanner;

public class Uni5Exe3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Descreva um algoritmo que calcule e escreva a soma da seguinte série de 100 termos:
        // S = 1/1 + 1/2 + 1/3 + ... + 1/100

        double soma = 0;

        for (int i = 1; i <= 100; i++) {
            soma += 1.0 / i;
        }

        System.out.println("A soma da série de 100 termos é: " + soma);

        scanner.close();
    }
}
