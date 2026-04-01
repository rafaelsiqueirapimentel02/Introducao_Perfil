package PrimeiroSemestre.Unidade4;

import java.util.Scanner;

public class Uni4Exe22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cursos:\n" + "(1) Ciência da Computação\n" + "(2) Licenciatura da Computação\n" + "(3) Sistemas de Informação\n" + "Digite o curso de sua preferência:");
        int escolha = scanner.nextInt();

        switch (escolha) {
    case 1:
        System.out.println("Bacharel em Ciência da Computação");
        break;
    case 2:
        System.out.println("Licenciado em Computação");
        break;
    case 3:
        System.out.println("Bacharel em Sistemas de Informação");
        break;
    default:
        System.out.println("Opção inválida");
}
        scanner.close();
    }
}
