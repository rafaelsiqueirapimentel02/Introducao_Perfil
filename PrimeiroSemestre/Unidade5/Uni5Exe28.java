package PrimeiroSemestre.Unidade5;

import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int votosNdN = 0;
        int votosCPM22 = 0;
        int votosSkank = 0;
        int votosJQuest = 0;
        char escolha = 's';
        int totalVotos = 0;

        while (escolha == 's') {
            System.out.print("Digite o número da banda: Nenhum de Nós(1), CPM22(2), Skank(3), Jota Quest(4): ");
            int banda = scanner.nextInt();

            switch (banda) {
                case 1:
                    votosNdN++;
                    break;
                case 2:
                    votosCPM22++;
                    break;
                case 3:
                    votosSkank++;
                    break;
                case 4:
                    votosJQuest++;
                    break;
                default:
                    System.out.println("Banda inválida!");
            }

            //percentual de cada grupo
            totalVotos = votosNdN + votosCPM22 + votosSkank + votosJQuest;

            System.out.print("Deseja registrar mais um voto? (s/n): ");
            escolha = scanner.nextLine().toLowerCase().charAt(0);
        }

        System.out.println("Resultados da votação:");
        System.out.println("Nenhum de Nós: " + votosNdN + " (" + (votosNdN * 100.0 / totalVotos) + "%)");
        System.out.println("CPM22: " + votosCPM22 + " (" + (votosCPM22 * 100.0 / totalVotos) + "%)");
        System.out.println("Skank: " + votosSkank + " (" + (votosSkank * 100.0 / totalVotos) + "%)");
        System.out.println("Jota Quest: " + votosJQuest + " (" + (votosJQuest * 100.0 / totalVotos) + "%)");

        //Vencedor
        String vencedor = "";
        if (totalVotos > 0) {
            if (votosNdN >= votosCPM22 && votosNdN >= votosSkank && votosNdN >= votosJQuest) {
                vencedor = "Nenhum de Nós";
            } else if (votosCPM22 >= votosSkank && votosCPM22 >= votosJQuest) {
                vencedor = "CPM22";
            } else if (votosSkank >= votosJQuest) {
                vencedor = "Skank";
            } else {
                vencedor = "Jota Quest";
            }
        }
        System.out.println("Vencedor: " + vencedor);

        scanner.close();
    }
}