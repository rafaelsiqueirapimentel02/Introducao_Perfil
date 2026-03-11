package Unidade3;

import java.util.Scanner;

public class Uni3Exe13 {
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

    System.out.print("Altura da Parede: ");
    double altura = s.nextDouble();

    System.out.print("Comprimento da Parede: ");
    double comprimento = s.nextDouble();

    double azulejo = (altura * comprimento) * 9;
    double ValorTotal = azulejo * 12.50;
    System.out.println("O Valor final é: " + ValorTotal);
    s.close();
    }
}
