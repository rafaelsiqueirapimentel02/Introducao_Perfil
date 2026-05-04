package PrimeiroSemestre.Unidade5;

import java.util.Scanner;

public class Uni5Exe21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double chico = 1.5;
        double ze = 1.1;
        int anos = 0;

        while (chico >= ze) {
            chico += 0.02;
            ze += 0.03;
            anos++;
        } 
        
        System.out.println("Serão necessários " + anos + " anos para que Zé seja mais alto que Chico.");
        scanner.close();
    }
}
