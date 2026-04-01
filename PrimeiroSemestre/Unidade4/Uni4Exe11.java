package PrimeiroSemestre.Unidade4;

import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ano de nascimento do primeiro irmão: ");
        int ano1 = scanner.nextInt();
        System.out.print("Ano de nascimento do segundo irmão: ");
        int ano2 = scanner.nextInt();
        System.out.print("Ano de nascimento do terceiro irmão: ");
        int ano3 = scanner.nextInt();

        if (ano1 == ano2 && ano1 == ano3) {
            System.out.print("São Trigêmeos");
        } else if (ano1 == ano2 || ano1 == ano3 || ano2 == ano3) {
            System.out.print("São Gêmeos");
        } else {
            System.out.print("São apenas irmãos");
        }

        scanner.close();
    }
}
