package Unidade4;

import java.util.Scanner;

public class Uni4Exe14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o Dia: ");
        int Dia = scanner.nextInt();
        System.out.print("Digite o Mês: ");
        int Mes = scanner.nextInt();
        System.out.print("Digite o Ano: ");
        int Ano = scanner.nextInt();

        if (Mes < 1 || Mes > 12) {
            System.out.print("Data Inválida");
        } else if (Mes == 2) {
            boolean bissexto = (Ano % 4 == 0 && Ano % 100 != 0) || (Ano % 400 == 0);
            int diasNoMes = bissexto ? 29 : 28;
            if (Dia < 1 || Dia > diasNoMes) {
                System.out.print("Data Inválida");
            } else {
                System.out.print("Data Válida");
            }
        } else if (Mes == 4 || Mes == 6 || Mes == 9 || Mes == 11) {
            if (Dia < 1 || Dia > 30) {
                System.out.print("Data Inválida");
            } else {
                System.out.print("Data Válida");
            }
        } else {
            if (Dia < 1 || Dia > 31) {
                System.out.print("Data Inválida");
            } else {
                System.out.print("Data Válida");
            }
        }
        scanner.close();
    }
}
