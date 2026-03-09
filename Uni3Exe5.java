import java.util.Scanner;

public class Uni3Exe5{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

    System.out.print("Quantos frangos precisam de marcação: ");
    double frangos = s.nextDouble();

    double id = (frangos * 4.0);
    double anel = (frangos * 3.50 * 2);
    double valor = (id + anel);

    System.out.print("O gasto total para marcar "+ frangos + " é: "+ valor);

    s.close();
    }
}