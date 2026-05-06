package PrimeiroSemestre.Unidade5;

import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o limite de pesca diário? ");
        double limiteKG = scanner.nextDouble();

        double pescaG = 0;
        char escolha = 'S';

        while(escolha == 'S' && pescaG <= limiteKG){
            System.out.print("Quantas gramas pesa seu peixe? ");
            double pesca = scanner.nextDouble();
            pesca = pesca / 1000;
            pescaG += pesca;

            System.out.print("Deseja pesar um novo peixe? S/N: ");
            escolha = Character.toUpperCase(scanner.next().charAt(0));
        }

            scanner.close();
    }
}
