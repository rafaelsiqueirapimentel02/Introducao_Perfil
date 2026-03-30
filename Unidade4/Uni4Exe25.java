package Unidade4;

import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Digite dois valores: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        System.out.print("(1) Soma\n" + "(2) Diferença\n" + "(3) Produto\n" + "(4) Divisão\n" + "Qual deseja fazer? ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                int soma = n1 + n2;
                System.out.print("Soma: " + soma);
                break;
            case 2: 
                int dif = Math.abs(n1 - n2);
                System.out.print("Diferença: " + dif);
                break;
            case 3:
                double produto = n1 * n2;
                System.out.print("Produto: " + produto);
                break; 
            case 4:
                if (n2 == 0) {
                    System.out.print("Não foi possível efetuar a Divisão");
                } else {
                    double div = n1 / n2;
                    System.out.print("Divisão: " + div);
                }
                break;
            default: 
                System.out.print("Inválido");
                break;
        }

        scanner.close();
    }
}
