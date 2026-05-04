package PrimeiroSemestre.Unidade5;

import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int canal;
        int pessoas;

        int totalPessoas = 0;

        int canal4 = 0;
        int canal5 = 0;
        int canal9 = 0;
        int canal12 = 0;

        while (true) {
            System.out.print("Canal: ");
            canal = scanner.nextInt();

            if (canal == 0) {
                break;
            }

            System.out.print("Pessoas assistindo: ");
            pessoas = scanner.nextInt();

            totalPessoas += pessoas;

            switch (canal) {
                case 4:
                    canal4 += pessoas;
                    break;
                case 5:
                    canal5 += pessoas;
                    break;
                case 9:
                    canal9 += pessoas;
                    break;
                case 12:
                    canal12 += pessoas;
                    break;
            }
        }

        if (totalPessoas > 0) {
            System.out.println("Percentual de audiência do canal 4: " + (canal4 * 100.0 / totalPessoas) + "%");
            System.out.println("Percentual de audiência do canal 5: " + (canal5 * 100.0 / totalPessoas) + "%");
            System.out.println("Percentual de audiência do canal 9: " + (canal9 * 100.0 / totalPessoas) + "%");
            System.out.println("Percentual de audiência do canal 12: " + (canal12 * 100.0 / totalPessoas) + "%");
        } else {
            System.out.println("Nenhuma audiência registrada.");
        }

        scanner.close();
    }
}

            
