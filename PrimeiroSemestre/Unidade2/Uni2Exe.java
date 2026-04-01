package PrimeiroSemestre.Unidade2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni2Exe {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

    System.out.print("Nome do Aluno: ");
    String nome = s.nextLine();

    System.out.print("Notas do aluno: ");
    double nota1 = s.nextDouble();
    double nota2 = s.nextDouble();
    double nota3 = s.nextDouble();

    double media = (nota1 + nota2 + nota3) / 3;

    System.out.println("Média do aluno: " + df.format(media));

    if (
        media < 7
    ) {
        System.out.println(nome + " reprovado.");
    } else {
        System.out.println(nome + " aprovado.");
    }

    s.close();
    }
}