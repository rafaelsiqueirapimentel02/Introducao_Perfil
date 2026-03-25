package Unidade4;

import java.util.Scanner;

public class Uni4Exe12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeiro lado: ");
        int lado1 = scanner.nextInt();
        System.out.print("Segundo lado: ");
        int lado2 = scanner.nextInt();
        System.out.print("Terceiro lado: ");
        int lado3 = scanner.nextInt();

        if (lado1 >= lado2 + lado3 || lado2 >= lado1 + lado3 || lado3 >= lado2 + lado1) {
            System.out.print("Não é um triângulo válido");
        }else if (lado1 == lado2 && lado1 == lado3) {
            System.out.print("É equilátero"); 
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.print("É isóceles");
        } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
            System.out.print("É escaleno");
        } 
        
        scanner.close();
        
    }
}
