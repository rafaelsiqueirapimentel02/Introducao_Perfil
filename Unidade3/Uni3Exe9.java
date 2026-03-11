package Unidade3;

import java.util.Scanner;

public class Uni3Exe9 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Raio da lata de óleo: ");
        double raio = s.nextDouble();

        System.out.print("Altura da lata de óleo; ");
        double altura = s.nextDouble();

        double volume = (Math.PI * Math.pow(raio, 2) * altura);
        System.out.print("O volume da lata de óleo é: " + volume);
        s.close();
    }
}