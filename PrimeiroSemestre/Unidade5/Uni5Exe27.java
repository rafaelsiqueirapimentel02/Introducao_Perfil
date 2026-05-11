package PrimeiroSemestre.Unidade5;

import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha = 1;
        int pecasTotalManha = 0;
        int pecasTotalTarde = 0;
        double salário = 0;

        while (escolha == 1) {
            System.out.print("Digite o dia de Abril: ");
            int dia = scanner.nextInt();

            while (dia < 1 || dia > 30) {
                System.out.print("Dia inválido");
                dia = scanner.nextInt();
            }

            if (dia >= 1 || dia <= 15) {
                System.out.print("Total de peças produzidas pela manhã: ");
                int manha = scanner.nextInt();
                pecasTotalManha += manha;

                System.out.print("Total de peças produzidas pela tarde: ");
                int tarde = scanner.nextInt();
                pecasTotalTarde += tarde;


                if (pecasTotalManha >= 30 && pecasTotalTarde >=30) {
                    int pecasTotal = pecasTotalManha + pecasTotalTarde;
                    salário = 0.80 * pecasTotal;

                } else {
                    int pecasTotal = pecasTotalManha + pecasTotalTarde;
                    salário = 0.50 * pecasTotal;
                }
            }

            else if (dia >= 16 && dia <= 30) {
                System.out.print("Total de peças produzidas pela manhã: ");
                int manha = scanner.nextInt();
                pecasTotalManha += manha;

                System.out.print("Total de peças produzidas pela tarde: ");
                int tarde = scanner.nextInt();
                pecasTotalTarde += tarde;
             
                double manha2 = 0.40 * pecasTotalManha;
                double tarde2 = 0.30 * pecasTotalTarde; 
             }
        }


    }
}
