package Unidade4;

import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva Três valores: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        System.out.print("(1) Ordem Crescente\n" + "(2) Ordem Decresecnte\n" + "(3) Maior no Meio\n" + "Em que ordem você quer que eles sejam organizados? ");
        int opcao = scanner.nextInt();

        switch (opcao){
            case 1: // Crescente
                if (n1 <= n2 && n1 <= n3) {
                    if (n2 <= n3) {
                        System.out.println(n1 + " " + n2 + " " + n3);
                    } else {
                        System.out.println(n1 + " " + n3 + " " + n2);
                    }
                } else if (n2 <= n1 && n2 <= n3) {
                    if (n1 <= n3) {
                        System.out.println(n2 + " " + n1 + " " + n3);
                    } else {
                        System.out.println(n2 + " " + n3 + " " + n1);
                    }
                } else {
                    if (n1 <= n2) {
                        System.out.println(n3 + " " + n1 + " " + n2);
                    } else {
                        System.out.println(n3 + " " + n2 + " " + n1);
                    }
                }
                break;
            case 2: // Decrescente
                if (n1 >= n2 && n1 >= n3) {
                    if (n2 >= n3) {
                        System.out.println(n1 + " " + n2 + " " + n3);
                    } else {
                        System.out.println(n1 + " " + n3 + " " + n2);
                    }
                } else if (n2 >= n1 && n2 >= n3) {
                    if (n1 >= n3) {
                        System.out.println(n2 + " " + n1 + " " + n3);
                    } else {
                        System.out.println(n2 + " " + n3 + " " + n1);
                    }
                } else {
                    if (n1 >= n2) {
                        System.out.println(n3 + " " + n1 + " " + n2);
                    } else {
                        System.out.println(n3 + " " + n2 + " " + n1);
                    }
                }
                break;
            case 3: // Maior no meio
                if (n1 >= n2 && n1 >= n3) {
                    System.out.println(n2 + " " + n1 + " " + n3);
                } else if (n2 >= n1 && n2 >= n3) {
                    System.out.println(n1 + " " + n2 + " " + n3);
                } else {
                    System.out.println(n1 + " " + n3 + " " + n2);
                }
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        scanner.close();
    }
}
