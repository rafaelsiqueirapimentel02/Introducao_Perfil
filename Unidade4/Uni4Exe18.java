package Unidade4;

import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Data de vencimento da prestação: ");
        int data = scanner.nextInt();
        System.out.print("Dia do pagamento: ");
        int dia = scanner.nextInt();
        System.out.print("Valor da prestação: ");
        double prest = scanner.nextDouble();

        if (dia > data) {
            double multa = prest * 0.02 * (dia - data);
            double ajuste = prest + multa;
            System.out.print("O pagamento está muito atrasado, Multa de 2% por dia de atraso, Valor da Prestação: " + ajuste);
        } else if (dia < data) {
            double desconto = prest * 0.10;
            double ajuste = prest - desconto;
            System.out.print("O pagamento está adiantado, Desconto de 10%, Valor da Prestação: " + ajuste);
        } 
        scanner.close();
    }
}
