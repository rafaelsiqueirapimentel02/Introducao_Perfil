package Unidade3;

import java.util.Scanner;

public class Uni3Exe4 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

    System.out.print("Notas do aluno: ");
    double nota1 = s.nextDouble();
    double nota2 = s.nextDouble();
    double nota3 = s.nextDouble();

    double media = (nota1 + nota2 + nota3) / 3;

    System.out.println("Média do aluno: " + media);
    s.close();
    }
}