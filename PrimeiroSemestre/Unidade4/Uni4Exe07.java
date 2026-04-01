package PrimeiroSemestre.Unidade4;

import java.util.Scanner;

public class Uni4Exe07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso da carta em gramas: ");
        double peso = scanner.nextDouble();

        if (peso <= 50) {
             System.out.print("O valor ficou R$ 0,45");
        } else {
            if (peso > 50) {
                double excesso = peso - 50;
                excesso = excesso / 20;
                double teto = Math.ceil(excesso);
                double valorAD = teto * 0.45;
                double valorTotal = valorAD + 0.45;

                System.out.print("O valor ficou: " + valorTotal);
            }
        }
        scanner.close();
    }
}
