package PrimeiroSemestre.Unidade3;

import java.util.Scanner;

public class Uni3Exe11 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

    System.out.print("Temperatura em °C: ");
    double celsius = s.nextDouble();
    double fahrenheit = (celsius * 9/5) + 32;
    System.out.println("Temperatura em °F: " + fahrenheit);
    s.close();
    }
}
