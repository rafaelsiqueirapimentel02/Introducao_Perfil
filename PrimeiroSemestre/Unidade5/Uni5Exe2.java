package PrimeiroSemestre.Unidade5;

import java.util.Scanner;

public class Uni5Exe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Descreva um algoritmo que calcule e escreva a soma dos números pares e a soma dos números ímpares entre 1 e 100.

        int somapar = 0;
        int somaimpar = 0;

        for(int i = 1; i <=100; i++){
            if (i % 2 == 0) {
                somapar += i;
            } else {
                somaimpar += i;
            }
        }

        System.out.println("A soma dos números pares entre 1 e 100 é: " + somapar);
        
        System.out.println("A soma dos números ímpares entre 1 e 100 é: " + somaimpar);


        scanner.close();
            
        }

    }

