package Unidade4;

import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Há quantos meses você foi admitido: ");
        int meses = scanner.nextInt();

        if (meses > 48)
            System.out.print("Reajuste não informado");
        else if (meses <= 12) 
            System.out.print("O seu reajuste é de 5%");
        else 
            System.out.print("Seu reajuste foi de 7%");
        

        scanner.close();
    }
}
