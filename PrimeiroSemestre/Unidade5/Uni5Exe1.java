package PrimeiroSemestre.Unidade5;

import java.util.Scanner;

public class Uni5Exe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(int i = 1; i <=20; i++);
        System.out.print("Digite um número: ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " É par");
        } else 
            System.out.print(n + " É ímpar");

        scanner.close();
    }

}
