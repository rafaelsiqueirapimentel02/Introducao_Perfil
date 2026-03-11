package Unidade3;

import java.util.Scanner;

public class Uni3Exe6 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

    System.out.print("Peso do prato: ");
    double peso = s.nextDouble();

    double prato = (peso - 0.75);
    double valor = (prato * 25.0); 

    System.out.print("O valor do prato do cliente é: " + valor);

    s.close();
    }
}