import java.util.Scanner;

public class Uni3Exe1{

    public static void main(String[] args){
Scanner s = new Scanner(System.in);

System.out.print("Comprimento: ");
double Comprimento = s.nextDouble();

System.out.print("Largura: ");
double Largura = s.nextDouble();

double area = (Comprimento * Largura);

System.out.println("Área = " + area);
 
s.close();
    }
}