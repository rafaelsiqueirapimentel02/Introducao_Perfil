package PrimeiroSemestre.Unidade5;

import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        
        Escreva um programa que imprime um calendário para um determinado mês. O calendário deve conter cada dia do mês e o dia da semana correspondente. 
        A entrada consiste de um inteiro especificando em que dia da semana cai o primeiro dia do mês (1=Domingo, 2=Segunda,...,7=Sábado) 
        e um inteiro especificando o número de dias que o mês possui.

        Exemplo: p = 3 n = 31

        D	S	T	Q	Q	S	S
        1	2	3	4	5
        6	7	8	9	10	11	12
        13	14	15	16	17	18	19
        20	21	22	23	24	25	26
        27	28	29	30	31		

        usando while;
        */

        System.out.print("Digite o dia da semana do primeiro dia do mês (1=Domingo, 2=Segunda,...,7=Sábado): ");
        int primeiroDia = scanner.nextInt();
        System.out.print("Digite o número de dias do mês: ");
        int numDias = scanner.nextInt();
        
        String[] diasSemana = {"D", "S", "T", "Q", "Q", "S", "S"};
        System.out.println(String.join("\t", diasSemana));

        int diaAtual = 1;
        int i = 1;
        while (i < primeiroDia) {
            System.out.print("\t");
            i++;
        }
        while (diaAtual <= numDias) {
            System.out.print(diaAtual + "\t");
            if (i % 7 == 0) {
                System.out.println();
            }
            diaAtual++;
            i++;
        }
        
        scanner.close();
    }
}
