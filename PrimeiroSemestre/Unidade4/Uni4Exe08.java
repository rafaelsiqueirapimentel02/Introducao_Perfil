package PrimeiroSemestre.Unidade4;

import java.util.Scanner;

public class Uni4Exe08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva uma Letra: ");
        String letra = scanner.next();

        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u") 
            ||letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")){
            
            System.out.print("É vogal");
        } else {
            System.out.print("Não é vogal");
        }

        scanner.close();
    }
}
