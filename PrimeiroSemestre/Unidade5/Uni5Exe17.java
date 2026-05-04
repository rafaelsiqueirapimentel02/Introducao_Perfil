package PrimeiroSemestre.Unidade5;

import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inscricao;
        double altura = 0;
        double alturaTotal = 0;
        int quantidadeTotal = 0;
        int inscricaoMaisAlto = 0;
        int inscricaoMaisBaixo = 0;

        double maior = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;

        while (true) {
            System.out.print("Digite seu número de inscrição: ");
            inscricao = scanner.nextInt();
            
            if (inscricao == 0) {
                break;
            }

            System.out.print("Digite sua altura: ");
            altura = scanner.nextDouble();

            alturaTotal += altura;
            quantidadeTotal++;

            if (altura > maior) {
                maior = altura;
                inscricaoMaisAlto = inscricao;
            }
            if (altura < menor) {
                menor = altura;
                inscricaoMaisBaixo = inscricao;
            }

        }
        if (quantidadeTotal > 0) {
            double media = alturaTotal / quantidadeTotal;
            System.out.println("Média das alturas: " + media);
        }
        System.out.println("O atleta mais alto tem " + maior + " de altura e o seu número de inscrição é " + inscricaoMaisAlto);
        System.out.println("O atleta mais baixo tem " + menor + " de altura e o seu número de inscrição é " + inscricaoMaisBaixo);
        scanner.close();
    }
}
