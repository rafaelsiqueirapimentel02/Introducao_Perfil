package PrimeiroSemestre.Unidade5;

import java.util.Scanner;

public class Uni5Exe9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de alunos: ");
        int n = scanner.nextInt();

        double jovemadulto = 0;
        double adultos = 0;
        String nomesJovemAdulto = "";

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o nome e a idade do aluno " + i + ": ");
            String nome = scanner.next();
            double idade = scanner.nextDouble();

            if (idade == 18) {
                jovemadulto++;
                nomesJovemAdulto = nomesJovemAdulto + nome + " ";
            }

            if (idade > 18) { 
                adultos++;
            }
                     
    }   System.out.print("nomes dos alunos com 18 anos: " + nomesJovemAdulto + "\n");
        System.out.print("Quantidade de alunos com mais de 18 anos: " + adultos);
        scanner.close();
    

    }
}
    