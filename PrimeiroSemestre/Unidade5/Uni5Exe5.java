package PrimeiroSemestre.Unidade5;

import java.util.Scanner;

public class Uni5Exe5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        for (int i = 0; i < 20; i++) {
            int rand = (int) (Math.random() * 201) - 100; // Gerar um número aleatório entre -100 e 100
            numero = rand;

            if(i == 5 && numero > 2){
                System.out.println("O número 5 é maior que 2");
            } else if (i == 7 && numero > 2) {
                System.out.println("O número 7 é maior que 2");
            } else {
                System.out.println("Não houve resultado");
            }
                scanner.close();
            }
        } 
        
        
    }

