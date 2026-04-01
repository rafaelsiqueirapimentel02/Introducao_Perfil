package PrimeiroSemestre.Unidade4;

import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        float numero = scanner.nextFloat();

        if (numero != (int)numero) {
            System.out.print("Casas Decimais foram digitadas");
        } else {
            System.out.print("Casas Decimais não foram digitadas");
        }

        scanner.close();
    }
}
