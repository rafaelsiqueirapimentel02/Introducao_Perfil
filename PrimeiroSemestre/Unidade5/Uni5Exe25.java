package PrimeiroSemestre.Unidade5;

import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pingD = 0;
        int pongE = 0;
        boolean vencedor = false;

        while (vencedor == false) {
            boolean pingPong = Math.random() < 0.5;
            if (pingPong == true) {
            pingD++;
                System.out.print("Ponto para o jogador a direita " + pingD + "\n");

            } else if (pingPong == false) {
            pongE++;
                System.out.print("Ponto para o jogador a esquerda " +  pongE + "\n");
            }
            int dif = Math.abs(pongE - pingD);

            if (pingD >= 21 && pingD > pongE && dif >= 2) {
                System.out.print("\n\nO jogador a Direita foi o vencedor!");
                vencedor = true;
            } else if (pongE >= 21 && pingD < pongE && dif >= 2) {
                System.out.print("\n\nO jogador a Esquerda é o vencedor!");
                vencedor = true;
        }
    }

    scanner.close();
}
}
