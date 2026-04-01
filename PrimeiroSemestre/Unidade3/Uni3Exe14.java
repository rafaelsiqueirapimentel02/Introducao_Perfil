package PrimeiroSemestre.Unidade3;

import java.util.Scanner;

public class Uni3Exe14 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

    System.out.print("Distância percorrida (km): ");
    double distancia = s.nextDouble();

    System.out.print("Tempo gasto (h): ");
    double tempo = s.nextDouble();

    double gastoCombustivel = (distancia / 12.0);

    double velocidade = distancia / tempo;
    System.out.println("Velocidade média (km/h): " + velocidade + " km/h" + " Gasto de combustível : " + gastoCombustivel + " Litros");
    s.close();
    }
}
