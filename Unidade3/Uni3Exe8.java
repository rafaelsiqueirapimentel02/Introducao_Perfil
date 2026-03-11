package Unidade3;

import java.util.Scanner;

public class Uni3Exe8 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Valor em Dólar: ");
        double dolar = s.nextDouble();

        Double cotacao = 5.65;
        double real = (dolar * cotacao);

        System.out.print("O atendente deve devolver : " + real + " reais para o cliente");

        s.close();
}

}
