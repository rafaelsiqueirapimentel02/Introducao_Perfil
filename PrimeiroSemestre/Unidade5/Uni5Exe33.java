package PrimeiroSemestre.Unidade5;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni5Exe33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int voto = 0;
        int voto1 = 0;
        int voto2 = 0;
        int voto3 = 0;
        int voto4 = 0;
        int votoNulo = 0;
        int votoBranco = 0;
        int totalVotos = 0;

        do {
            System.out.print("Digite o número do candidato (1, 2, 3, 4), ou 5 para voto nulo, ou 6 para voto em branco: ");
            voto = scanner.nextInt();
            totalVotos++;

            switch (voto) {
                case 1:
                    voto1++;
                    break;
                case 2:
                    voto2++;
                    break;
                case 3:
                    voto3++;
                    break;
                case 4:
                    voto4++;
                    break;
                case 5:
                    votoNulo++;
                    break;
                case 6:
                    votoBranco++;
                    break;
                default:
                    System.out.println("Voto inválido!");

            }

                totalVotos = voto1 + voto2 + voto3 + voto4 + votoNulo + votoBranco;
        }   while (voto != 0 && voto <= 6);

        System.out.println("Resultados da votação:");
        System.out.println("Candidato 1: " + voto1);
        System.out.println("Candidato 2: " + voto2);
        System.out.println("Candidato 3: " + voto3);
        System.out.println("Candidato 4: " + voto4);
        System.out.println("Votos nulos: " + votoNulo + " (" + df.format((votoNulo * 100.0 / totalVotos)) + "%)");
        System.out.println("Votos em branco: " + votoBranco + " (" + df.format((votoBranco * 100.0 / totalVotos)) + "%)");
    }   


}
