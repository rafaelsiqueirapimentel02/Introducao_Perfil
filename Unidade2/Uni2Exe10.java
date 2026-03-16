package Unidade2;

import java.util.Scanner;

public class Uni2Exe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os segundos: ");
        double segundos = scanner.nextDouble();

        double horas = (int) (segundos / 3600);
        double minutos = (int) ((segundos % 3600) / 60);
        segundos = segundos % 60;

        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);

        scanner.close();
    }
}