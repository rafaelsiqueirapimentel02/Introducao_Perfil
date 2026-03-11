package Unidade3;

import java.util.Scanner;

public class Uni3Exe15 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número: ");
        int numero = scanner.nextInt();

        int centena = numero / 100;
        numero = numero % 100;
        int dezena = numero / 10;
        int unidade = numero % 10;

        System.out.println("Centena(s): " + centena + ", Dezena(s): " + dezena + ", Unidade(s): " + unidade);

        scanner.close();
    }

}
