package Unidade3;

import java.util.Scanner;

public class Uni3Exe16 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Valor total da compra: ");
        double valorCompra = s.nextDouble();

        System.out.print("Valor dado pelo cliente: ");
        double valorPago = s.nextDouble();

        double troco = valorPago - valorCompra;

        double valor100 = (int) (troco / 100);
        troco = troco % 100;
        double valor10 = (int) (troco / 10);
        double valor1 = (int) (troco % 10);

        double totalNotas = valor100 + valor10 + valor1;

        System.out.println("O número mínimo de notas para o troco é: " + totalNotas + " (Notas de 100: " + valor100 + ", Notas de 10: " + valor10 + ", Notas de 1: " + valor1);

        s.close();
    } 

}
