package Unidade4;

import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura e a massa:");
        double altura = scanner.nextDouble();
        double massa = scanner.nextDouble();

        double imc = massa / (altura * altura);

        if (imc < 18.5)
            System.out.print("Magreza");
        else if (imc > 18.5 && imc <= 24.9)
            System.out.print("Saúdavel");
        else if (imc >= 25 && imc < 29.9)
            System.out.print("Sobrepeso");
        else if (imc >= 30 && imc < 34.9)
            System.out.print("Obesidade Grau 1");
        else if (imc >= 35 && imc <39.9)
            System.out.print("Obesidade Grau 2 (severa)");        
        else if (imc >= 40)
            System.out.print("Obesidade Grau 3 (mórbida)");
        scanner.close();
    }
}
