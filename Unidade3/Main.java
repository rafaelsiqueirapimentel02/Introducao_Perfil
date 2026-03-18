package Unidade3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);  

    double dinheiro = scanner.nextInt();
    if (dinheiro < 0 || dinheiro > 1000000.00) {
        scanner.close();
        return;
    }
 
    double notas100 = dinheiro / 100;
    double resto = dinheiro % 100;
    double notas50 = resto / 50;
    resto = resto % 50;
    double notas20 = resto / 20;
    resto = resto % 20;
    double notas10 = resto / 10;
    resto = resto % 10;
    double notas5 = resto / 5;
    resto = resto % 5;
    double notas2 = resto / 2;
    resto = resto % 2;

    double moedas1 = notas2 / 1;
    resto = resto % 1;
    double moedas50 = resto / 0.50;
    resto = resto % 0.50;
    double moedas25 = resto / 0.25;
    resto = resto % 0.25;
    double moedas10 = resto / 0.10;
    resto = resto % 0.10;
    double moedas05 = resto / 0.5;
    resto = resto % 0.5;
    double moedas01 = resto / 0.1;
    resto = resto % 0.1;

    System.out.println("NOTAS:");

    System.out.println(notas100 + " nota(s) de R$ 100.00");
    System.out.println(notas50 + " nota(s) de R$ 50.00");
    System.out.println(notas20 + " nota(s) de R$ 20.00");
    System.out.println(notas10 + " nota(s) de R$ 10.00");
    System.out.println(notas5 + " nota(s) de R$ 5.00");
    System.out.println(notas2 + " nota(s) de R$ 2.00");

    System.out.println("MOEDAS:");

    System.out.println(moedas1 + " moeda(s) de R$ 1.00");
    System.out.println(moedas50 + " moeda(s) de R$ 0.50");
    System.out.println(moedas25 + " moeda(s) de R$ 0.25");
    System.out.println(moedas10 + " moeda(s) de R$ 0.10");
    System.out.println(moedas05 + " moeda(s) de R$ 0.05");
    System.out.println(moedas01 + " moeda(s) de R$ 0.01");


    scanner.close();

    }
}