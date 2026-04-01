package PrimeiroSemestre.Unidade4;

import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva a Hora e os Minutos de Chegada:");
        int horcheg = scanner.nextInt();
        int mincheg = scanner.nextInt();
        System.out.print("Escreva a Hora e os Minutos de Saída:");
        int horsaida = scanner.nextInt();
        int minsaida = scanner.nextInt();

        int hor = horsaida - horcheg;
        int min = minsaida - mincheg;

        if ((hor < 0 && hor > 24) || (min < 0 && min > 59)) {
            System.out.println("Horário inválido. Por favor, insira um horário válido.");
        } else {
            int horasEstacionado = hor;
            if (min > 0) {
                horasEstacionado++;
            }

            double preco;
            if (horasEstacionado <= 2) {
                preco = horasEstacionado * 5.00;
            } else if (horasEstacionado <= 4) {
                preco = 2 * 5.00 + (horasEstacionado - 2) * 7.50;
            } else {
                preco = 2 * 5.00 + 2 * 7.50 + (horasEstacionado - 4) * 10.00;
            }
            System.out.println("Preço a ser cobrado: R$ " + preco);
        }


        scanner.close();
    }
}
