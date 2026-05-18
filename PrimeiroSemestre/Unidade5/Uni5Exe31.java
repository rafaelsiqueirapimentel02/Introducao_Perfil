package PrimeiroSemestre.Unidade5;

import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Dado um número inteiro positivo, determine a sua decomposição em fatores primos. A saída do programa deve ser semelhante ao exemplo abaixo:
        número	decomposição
        180	2
        90	2
        45	3
        15	3
        5	5
        1	
        */

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();
        System.out.println("Número\tDecomposição");
        for (int i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                System.out.println(numero + "\t" + i);
                numero /= i;
            }
        }

        scanner.close();
    }
}
