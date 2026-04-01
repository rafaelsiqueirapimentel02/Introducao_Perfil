package PrimeiroSemestre.Unidade4;

import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número 1: ");
        int n1 = scanner.nextInt();
        System.out.print("Número 2: ");
        int n2 = scanner.nextInt();

        if (n2 != 0 && n1 % n2 == 0) {
            System.out.print("Os valores são múltiplos");
        } else {
            System.out.print("Os valores não são múltiplos");
        }

        scanner.close();
    }
}
