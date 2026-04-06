package PrimeiroSemestre.Unidade4;

import java.util.Scanner;

public class Uni4Exe13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o Primeiro número: ");
        int carta1 = scanner.nextInt();
        System.out.print("Digite o Segundo número: ");
        int carta2 = scanner.nextInt();
        System.out.print("Digite o Terceiro número: ");
        int carta3 = scanner.nextInt();

        boolean c1 = (carta1 == 1 || carta1 == 2 || carta1 == 3);
        boolean c2 = (carta2 == 1 || carta2 == 2 || carta2 == 3);
        boolean c3 = (carta3 == 1 || carta3 == 2 || carta3 == 3);

        if (c1 == false && c2 == false && c3 == false) {
            System.out.print("");
        } else if (c1 && c2 && c3){
            System.out.print("NOVE");
        } else if ((c1 && c2) || (c1 && c3) || (c2 && c3)){
            System.out.print("SEIS");
        } else if (c1 || c2 || c3){
            System.out.print("TRUCO");

        scanner.close();
    }
}
}
//outra forma de fazer 
//
//int boas =0;
//if(carta1 == 1 || carta1 == 2 || carta1 == 3)
//     boas++;
//if(carta2 ==1 || carta2 == 2 || carta2 == 3)
//     boas++; 
//if(carta3 == 1 || carta3 ==2 || carta3 == 3)
//     boas++;
//if(boas == 1)
//  System.out.println("Truco")
//if(boas == 2)
//  System.out.println("Seis")
//if(boas == 3)
//  System.out.println("Nove")
 
 

