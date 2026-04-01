package PrimeiroSemestre.Unidade4;

import java.util.Scanner;

public class Uni4Exe19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Coordenadas X e Y: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x == 0 && y == 0) 
            System.out.print("Quadrante 0");
        else if (x > 0 && y > 0) 
            System.out.print("Quadrante 1");
        else if (x < 0 && y > 0)
            System.out.print("Quadrante 2");
        else if (x > 0 && y < 0)
            System.out.print("Quadrante 4");
        else if (x < 0 && y < 0)
            System.out.print(" Quadrante 3");
        

        scanner.close();
    }
}
