package PrimeiroSemestre.Unidade4;

import java.util.Scanner;
import java.util.Arrays;

public class Uni4Exe24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva Três valores: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        int[] numeros = {n1, n2, n3};

        System.out.print("(1) Ordem Crescente\n" + "(2) Ordem Decresecnte\n" + "(3) Maior no Meio\n" + "Em que ordem você quer que eles sejam organizados? ");
        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                Arrays.sort(numeros);
                System.out.println("Ordem Crescente: " + numeros[0] + ", " + numeros[1] + ", " + numeros[2]);
                break;
            case 2:
                Arrays.sort(numeros);
                System.out.println("Ordem Decrescente: " + numeros[2] + ", " + numeros[1] + ", " + numeros[0]);
                break;
            case 3:
                Arrays.sort(numeros);
                System.out.println("Maior no Meio: " + numeros[0] + ", " + numeros[2] + ", " + numeros[1]);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        scanner.close();
    }
}
