package Unidade4;

import java.time.Month;
import java.util.Scanner;

public class Uni4Exe14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("DIgite o Dia: ");
        int Dia = scanner.nextInt();
        System.out.print("DIgite o Mês: ");
        int Mes = scanner.nextInt();
        System.out.print("DIgite o Ano: ");
        int Ano = scanner.nextInt();

        boolean Day = ((Dia >= 1 || Dia <= 31) || Dia == 28 || Dia == 29);
        boolean Month = (Mes >= 1 || Mes <= 12);
        boolean Year = (Ano >= 1 || Ano <= 3000);
        boolean bissexto = (Ano % 4 == 0 && Ano % 100 != 0) || (Ano % 400 == 0 );

        if ((bissexto = false && Dia == 29) || (bissexto = true) ) {
            
        }
        scanner.close();
    }
}
