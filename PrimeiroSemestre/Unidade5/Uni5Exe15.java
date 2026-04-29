package PrimeiroSemestre.Unidade5;

import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
        System.out.print("Nome do aluno: ");
        String nome = scanner.next();

        if (nome.equals("Fim")) {
        break;
    }

        System.out.print("Digite as duas notas: ");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("Nome: " + nome + " Média: " + media);
}

        scanner.close();
  }
}

