package PrimeiroSemestre.Unidade4;

import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Oque deseja calcular?\n" + "(T) Área do Triângulo\n" + "(Q) Área de um Quadrado\n" + "(R) Área de um Retângulo\n" + "(C) Área de um Círculo\n" + "Escolha: ");
        String calculo = scanner.next();

        switch (calculo) {
            case "T":
            case "t":
                System.out.print("Digite a Base do Triângulo: ");
                double base = scanner.nextDouble();
                System.out.print("Digite a Altura do Triângulo: ");
                double alt = scanner.nextDouble();
                double areaT = (base * alt) /2;
                System.out.print("Área do Triângulo: " + areaT);
                break;
            case "Q":
            case "q": 
                System.out.print("Digite o lado do Quadrado: ");
                double lado = scanner.nextDouble();
                double areaQ = lado * lado;
                System.out.print("Área do Quadrado: " + areaQ);
                break;
            case "R":
            case "r":
                System.out.print("Digite a Base do Retângulo: ");
                double baseR = scanner.nextDouble();
                System.out.print("Digite a Altura do Retângulo: ");
                double altR = scanner.nextDouble();
                double areaR = baseR * altR;
                System.out.print("Área do Retângulo: " + areaR); 
                break; 
            case "C":
            case "c":
                System.out.print("Digite o Raio do Círculo: ");
                double raio = scanner.nextDouble();
                double areaC = Math.PI * raio * raio;
                System.out.print("Área do Quadrado: " + areaC);
                break;
            default: 
                System.out.print("Inválido");
                break;
        }

        scanner.close();
    }
    
}
