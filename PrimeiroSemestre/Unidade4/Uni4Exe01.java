package PrimeiroSemestre.Unidade4;

import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantidade de Horas Trabalhadas no mês: ");
        float horasTrabalhadasNoMes = scanner.nextFloat();

        System.out.print("Valor da Hora Trabalhada: ");
        Float valorHora = scanner.nextFloat();

        int horasMes = 160;

        float salarioMensal = horasTrabalhadasNoMes * valorHora;

        if (horasTrabalhadasNoMes > horasMes) {
            float horaExtra = horasTrabalhadasNoMes - horasMes;
            float valorExtra = horaExtra * (valorHora * 0.5f);

            salarioMensal += valorExtra;
            
        }

        System.out.println("Salário Total é: " + salarioMensal);

        scanner.close();
}
}