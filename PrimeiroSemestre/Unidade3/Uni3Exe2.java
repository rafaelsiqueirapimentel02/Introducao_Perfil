package PrimeiroSemestre.Unidade3;

import java.util.Scanner;

public class Uni3Exe2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

    System.out.print("Valor do Sapato: ");
    double Sapato = s.nextDouble();
    double desconto = Math.round(Sapato * 0.12 * 100.0) / 100.0;

    System.out.print("o valor do desconto é de: "+ desconto);

    double sapatotal = Math.round((Sapato - desconto) * 100.0) / 100.0;

    System.out.print(" O preço do par de sapatos com desconto é: "+ sapatotal);

    s.close();
    }
}