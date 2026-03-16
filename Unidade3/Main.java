package Unidade3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);  

        int minutosDeDistancia = scanner.nextInt();
        
        int carroXvelocidade = 60; // km/h
        int carroYvelocidade = 90; // km/h

        int tempoCarroX =  * carroXvelocidade;
        int tempoCarroY =  * carroYvelocidade;
        int DistanciaEmMinutos = (tempoCarroY - tempoCarroX) * 60;

        System.out.println(DistanciaEmMinutos + " minutos");

        scanner.close();

    }
}
