package PrimeiroSemestre.Unidade5;

import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        Double salario;
        Double totalVendas = 0.0;
        char escolha = 'S';

        while (escolha == 'S'){
            System.out.print("Nome do Funcionário: ");
            nome = scanner.next();

            System.out.print("Quantos itens foram vendidos: ");
            int quantidade = scanner.nextInt();

            for(int i = 1; i <= quantidade; i++){
                System.out.print("Digite o valor do produto e a quantidade vendida: ");
                double valor = scanner.nextDouble();
                double vendas = scanner.nextDouble();
                
                totalVendas += valor * vendas;
            }

            salario = totalVendas * 0.30;
            System.out.println("Nome do Funcionário:" + nome + "\nSalário:" + salario + "\nTotal de vendas:" + totalVendas);
            System.out.print("\ndeseja digitar os dados de mais um funcionário? S/N \n");
            escolha = Character.toUpperCase(scanner.next().charAt(0));

            }
            scanner.close();
        }
    }

