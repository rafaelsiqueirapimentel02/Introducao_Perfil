package PrimeiroSemestre.Unidade5;

import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorTotal = 0;
        double valorCompra;
        
        while (true) {
            System.out.print("Qual o valor de sua compra? ");
            valorCompra = scanner.nextDouble();

            if (valorCompra == 0) {    
                System.out.println("O valor total a receber é: " + valorTotal);
                break;
            }  if (valorCompra > 500) {
            valorTotal += valorCompra * 0.8; // 20% de desconto
            } else if (valorCompra <= 500) {
            valorTotal += valorCompra * 0.85; // 15% de desconto
        } 
            
        } scanner.close();
    } 
}

