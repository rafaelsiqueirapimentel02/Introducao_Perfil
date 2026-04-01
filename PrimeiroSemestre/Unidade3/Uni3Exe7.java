package PrimeiroSemestre.Unidade3;

import java.util.Scanner;

public class Uni3Exe7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Quantidade de 350ml: ");
        double Lata = s.nextDouble();

        System.out.print("Quantidade de 600ml: ");
        double Garrafa600 = s.nextDouble();

        System.out.print("Quantidade de 2L: ");
        double Garrafa2l = s.nextDouble();

        double Litros = (Lata * 0.35) + (Garrafa600 * 0.6) + (Garrafa2l * 2.0);

        System.out.println("O cliente comprou ao total " + Litros + " Litros.");

        s.close();
    }
}
