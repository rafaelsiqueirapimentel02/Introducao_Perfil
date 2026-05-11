package PrimeiroSemestre.Unidade5;

import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A partir de qual valor Astolfo se recusa a pagar: ");
        double negacao = scanner.nextDouble();

        double pedagio = 0; 
        int distancia = 0;
        int recusa = 0;
        int trecho150km = 0;
        int trechos = 0;
         
        while (pedagio >= 0){
            trechos++;
            System.out.print("O valor do pedágio e a distância(KM): ");
            pedagio = scanner.nextDouble();
            distancia = scanner.nextInt();
            
            if (pedagio >= negacao) {
                recusa++;
            } 
            if (pedagio < negacao && distancia > 150) {
                trecho150km++;
            }
        }

        System.out.print("Trechos que se recusou a pagar " + recusa + "\n");
        System.out.print("Trechos informados " + (trechos - 1) + "\n");
        System.out.print("Trechos acima de 150km que ele aceita pagar " + trecho150km);

        scanner.close();
    }
}
