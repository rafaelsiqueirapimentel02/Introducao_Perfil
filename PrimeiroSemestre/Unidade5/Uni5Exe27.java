package PrimeiroSemestre.Unidade5;

import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int escolha = 1;

        double maiorSalario = Double.NEGATIVE_INFINITY;
        int diaMaisProd = 0;

        while (escolha == 1) {

            System.out.print("Digite o dia de Abril: ");
            int dia = scanner.nextInt();

            while (dia < 1 || dia > 30) {
                System.out.print("Dia inválido, digite novamente: ");
                dia = scanner.nextInt();
            }

            System.out.print("Peças produzidas pela manhã: ");
            int manha = scanner.nextInt();

            System.out.print("Peças produzidas pela tarde: ");
            int tarde = scanner.nextInt();

            int total = manha + tarde;

            double salario;

            
            if (dia >= 1 && dia <= 15) {

                if (manha >= 30 && tarde >= 30 && total >= 100) {
                    salario = total * 0.80;
                } else {
                    salario = total * 0.50;
                }

            }
            else {

                salario = (manha * 0.40) + (tarde * 0.30);
            }

            // Maior salário
            if (salario > maiorSalario) {
                maiorSalario = salario;
                diaMaisProd = dia;
            }

            System.out.println("Salário: R$ " + salario);

            // Comparação produção
            if (manha > tarde) {
                System.out.println("Produziu mais pela manhã!");
            } else if (tarde > manha) {
                System.out.println("Produziu mais pela tarde!");
            } else {
                System.out.println("Produção igual nos dois períodos!");
            }

            System.out.print("Deseja cadastrar mais um funcionário? (1-sim / 2-não): ");
            escolha = scanner.nextInt();
        }

        System.out.println("Dia mais produtivo: " + diaMaisProd);

        scanner.close();
    }
}