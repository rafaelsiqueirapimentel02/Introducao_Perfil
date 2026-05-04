package PrimeiroSemestre.Unidade5;

import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double altura;
        double somaTotal = 0;
        int qtdTotal = 0;

        double somaMulheres = 0;
        int qtdMulheres = 0;

        while (true) {
            System.out.print("Altura: ");
            altura = scanner.nextDouble();

            if (altura == 0) {
                break;
            }

            System.out.print("Genero (M/F/O): ");
            char genero = scanner.next().charAt(0);

            // total
            somaTotal += altura;
            qtdTotal++;

            // mulheres
            if (genero == 'F' || genero == 'f') {
                somaMulheres += altura;
                qtdMulheres++;
            }
        }

        if (qtdMulheres > 0) {
            double mediaMulheres = somaMulheres / qtdMulheres;
            System.out.printf("A média da altura das mulheres é: %.2f\n", mediaMulheres);
        } else {
            System.out.println("Não há mulheres no grupo.");
        }

        if (qtdTotal > 0) {
            double mediaGrupo = somaTotal / qtdTotal;
            System.out.printf("A média de altura do grupo é: %.2f\n", mediaGrupo);
        } else {
            System.out.println("Nenhuma pessoa foi informada.");
        }

        scanner.close();
    }
}
    
