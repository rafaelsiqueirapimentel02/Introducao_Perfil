package PrimeiroSemestre.Unidade5;

import java.util.Scanner;

public class Uni5Exe8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de números: ");
        int n = scanner.nextInt();

        double menor = Double.POSITIVE_INFINITY;
        double somapos = 0.0;
        int countpos = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o número " + i + ": ");
            double num = scanner.nextDouble();

            if (num < menor) {
                menor = num;
            }

            if (num > 0) { 
                somapos += num; 
                countpos++; 
            }
        }

        double mediapos = (countpos > 0) ? somapos / countpos : 0.0;

        System.out.println("O menor número é: " + menor);
        System.out.println("A média dos positivos é: " + mediapos);
        scanner.close();
    }
}