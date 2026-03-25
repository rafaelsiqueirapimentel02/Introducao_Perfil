package Unidade4;

import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Idade de Marquinhos: ");
        int idade1 = scanner.nextInt();
        System.out.print("Idade de Zezinho: ");
        int idade2 = scanner.nextInt();
        System.out.print("Idade de Luluzinha: ");
        int idade3 = scanner.nextInt();

        if (idade1 < idade2 && idade1 < idade3) {
            System.out.print("Marquinhos é o caçula");
        } else {
        
        if (idade2 < idade1 && idade2 < idade3) {
            System.out.print("Zezinho é o caçula");    
            } else {
                System.out.print("Luluzinha é a caçula");
            }
        }

        scanner.close();
    }
}
