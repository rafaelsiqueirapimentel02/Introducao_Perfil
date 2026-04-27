package PrimeiroSemestre.Unidade5;

import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantas paradas para abastecer o carro foram feitas? ");
        int n = scanner.nextInt();

        double totalLitros = 0;
        double mediaQuilometragemPorLitro = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite a quilometragem do odômetro na parada " + i + ": ");
            double quilometragem = scanner.nextDouble();
            System.out.print("Digite a quantidade de combustível comprado na parada " + i + " (em litros): ");
            double litros = scanner.nextDouble();
            double quilometragemPorLitro = quilometragem / litros;
            System.out.println("Quilometragem obtida por litro na parada " + i + ": " + quilometragemPorLitro);
            totalLitros += quilometragemPorLitro;
        }
        mediaQuilometragemPorLitro = totalLitros / n;
        System.out.println("Quilometragem média obtida por litro: " + mediaQuilometragemPorLitro);
        scanner.close();
    }
}
