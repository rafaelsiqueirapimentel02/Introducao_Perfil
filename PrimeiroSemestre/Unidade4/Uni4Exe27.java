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

        if (min < 0) {
            hor--;
            min += 60;  
        }
        if ((horcheg < 0 || horcheg > 23) || (mincheg < 0 || mincheg > 59) || (horsaida < 0 || horsaida > 23) || (minsaida < 0 || minsaida > 59)) {
            System.out.println("Horário inválido. Por favor, insira um horário válido.");
        } else {
            int horasEstacionado = hor;
            if (min >= 30) {
                horasEstacionado++;
            }
            double preco;
            switch (horasEstacionado) {
                case 1:
                case 2:
                    preco = horasEstacionado * 5.00;
                    break;
                case 3:
                case 4:
                    preco = 2 * 5.00 + (horasEstacionado - 2) * 7.50;
                    break;
                default:
                    preco = 2 * 5.00 + 2 * 7.50 + (horasEstacionado - 4) * 10.00;
                    break;
            }
            System.out.println("Preço a ser cobrado: R$ " + preco);
        }


        scanner.close();
    }
}
