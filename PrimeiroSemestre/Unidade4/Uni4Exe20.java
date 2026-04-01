package PrimeiroSemestre.Unidade4;

import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dite as 4 notas do aluno:");
        float nota1 = scanner.nextFloat();
        float nota2 = scanner.nextFloat();
        float nota3 = scanner.nextFloat();
        float nota4 = scanner.nextFloat();

        float media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 9)
            System.out.print("A média de aproveitamento foi " + media + " Conceito A. Aprovado");
        else if (media >= 7.5 && media < 9)
            System.out.print("A média de aproveitamento foi " + media + " Conceito B. Aprovado");
        else if (media >= 6 && media < 7.5)
            System.out.print("A média de aproveitamento foi " + media + " Conceito C. Aprovado");
        else if (media >= 4 && media < 6)
            System.out.print("A média de aproveitamento foi " + media + " Conceito D. Reprovado");
        else if (media < 4)
            System.out.print("A média de aproveitamento foi " + media + " Conceito E. Reprovado");
        scanner.close();
    }
}
