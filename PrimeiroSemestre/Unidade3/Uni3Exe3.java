package PrimeiroSemestre.Unidade3;

import java.util.Scanner;

public class Uni3Exe3{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

    System.out.print("Valor da gasolina: ");
    double preco = s.nextDouble();

    System.out.print("Valor do Pagamento: ");
    double valor = s.nextDouble();

    double gasolina = (valor/preco);

    System.out.print("O motorista conseguiu colocar " + gasolina + " litros");

    s.close();
    }
}