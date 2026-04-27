package PrimeiroSemestre.Unidade5;

import java.util.Scanner;

public class Uni5Exe4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int s = 0;

        for (int i = 0; i <= 19; i++){
            int rand = (int) (Math.random() * 5000); // Gerar um número aleatório entre 0 e 100
            s += rand;
        }
        System.out.println("A soma dos 20 termos é: " + s);
        scanner.close();
    }
}
