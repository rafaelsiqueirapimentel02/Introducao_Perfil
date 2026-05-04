package PrimeiroSemestre.Unidade5;

import java.util.Scanner;

public class Uni5Exe22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Um funcionário recebe aumento anual. Em 1995 foi contratado por 2000 reais. Em 1996 recebeu aumento de 1.5%. A partir de 1997, os aumentos sempre correspondem ao dobro do ano anterior. Faça programa que determine o salário atual do funcionário.
        System.out.print("Digite o ano de contratação: ");
        int anoContratacao = scanner.nextInt();
        System.out.print("Digite o salário inicial do funcionário: ");
        double salarioInicial = scanner.nextDouble();

        double salarioFinal = salarioInicial;
        double percentualAumento = 1.5;

        while (true) {
            for (int ano = anoContratacao + 1; ano <= 2026; ano++) {
                salarioFinal += salarioFinal * (percentualAumento / 100);
                System.out.println("Ano: " + ano + " Salário: " + salarioFinal);
                percentualAumento *= 2;

            }

            System.out.println("Salário do funcionário no ano atual: " + salarioFinal);
            break;
        }   

        scanner.close();
        
    }
}
