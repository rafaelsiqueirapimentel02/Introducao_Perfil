package PrimeiroSemestre.Unidade5;

import java.util.Scanner;

public class Uni5Exe11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Uma máquina de biscoito está com problemas. Quando ligada, após 1 hora ela quebra 1 biscoito, na segunda hora ela quebra 3 biscoitos, na hora seguinte ela quebra 3 vezes a quantidade de biscoitos quebrados na hora anterior, e assim por diante. Faça um algoritmo que calcule quantos biscoitos são quebrados no final de cada dia (a máquina opera 16 horas por dia).
        int biscoitosQuebrados = 0;
        int biscoitosHoraAnterior = 1;

        for (int hora = 1; hora <= 16; hora++) {
            if (hora == 1) {
                biscoitosQuebrados += biscoitosHoraAnterior;
            } else if (hora == 2) {
                biscoitosHoraAnterior = 3;
                biscoitosQuebrados += biscoitosHoraAnterior;
            } else {
                biscoitosHoraAnterior *= 3;
                biscoitosQuebrados += biscoitosHoraAnterior;
            }
        }

        System.out.print("Quantidade de biscoitos quebrados no final do dia: " + biscoitosQuebrados);
        scanner.close();
    } 

}

