package PrimeiroSemestre.Unidade4;

import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Idade do homem mais velho: ");
        int Hv = scanner.nextInt();
        System.out.print("Idade do homem mais novo: ");
        int Hn = scanner.nextInt();
        System.out.print("Idade da mulher mais velha: ");
        int Mv = scanner.nextInt();
        System.out.print("Idade da mulher mais nova: ");
        int Mn = scanner.nextInt();

        int soma = Hv + Mn;
        int produto = Hn * Mv;

        System.out.print("Soma:" + soma + " Produto:" + produto);

        scanner.close();
    }
}
