package Unidade3;

import java.util.Scanner;

public class Uni3Exe12{

    public static void main(String[] args) throws Exception{
        Scanner s = new Scanner(System.in);

        System.out.print("Nome: ");
        String Nome = s.nextLine();

        System.out.print("Horas Trabalhadas: ");
        double Horas = s.nextDouble();

        System.out.print("Número de Dependentes: ");
        double Dependentes = s.nextDouble();

        double salariobase = (Horas * 10);
        double salariofamilia = (Dependentes * 60);
        double salariobruto = (salariobase + salariofamilia);

        double inss = (salariobase * 0.085);
        double imposto = (salariobase * 0.05);
        double salarioliquido = (salariobruto - inss - imposto);

        System.out.println("O funcionário " + Nome + " possui um salário bruto de " + salariobruto + " e um salário líquido de " + salarioliquido);

        s.close();
    }
}
