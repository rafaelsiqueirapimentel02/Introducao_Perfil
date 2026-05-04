package PrimeiroSemestre.Unidade5;

import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double massaInicial;
        double massaFinal = 0;
        int tempo;
         
        while (true) {
            System.out.print("Massa inicial (Kg): ");
            massaInicial = scanner.nextDouble();

            if (massaInicial == 0) {
                break;
            }

            // O material perde metade de sua massa a cada 50 segundos,Dada a sua massa inicial em Kg, descreva um algoritmo que determine o tempo necessário para que essa massa se torne menor que 0,5 gramas
            tempo = 0;
            while (massaInicial >= 0.0005) {
                massaInicial /= 2;
                tempo += 50;
                massaFinal = massaInicial;
            }
            System.out.println("Tempo necessário: " + tempo + " segundos" + " Massa final: " + massaFinal + " Kg");

        }
        scanner.close();
    }
}
