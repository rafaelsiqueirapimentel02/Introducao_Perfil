package PrimeiroSemestre.Unidade4;

import java.util.Scanner;

public class Uni4Exe05 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("A cor é azul? ");
    boolean resposta = scanner.nextBoolean();

    if (resposta == true) {
        System.out.print("Sim");
    } else {
        System.out.print("Não");
    }

    scanner.close();
}
    
}