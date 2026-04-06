package PrimeiroSemestre.Unidade3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);  
    
          int n1 = scanner.nextInt();
          int n2 = scanner.nextInt();
          int n3 = scanner.nextInt();

          if (n1 <= n2 && n1 <= n3) {
                    if (n2 <= n3) {
                        System.out.println(n1 + "\n" + n2 + "\n" + n3 + "\n\n" + n1 + "\n" + n2 + "\n" + n3);
                    } else {
                        System.out.println(n1 + "\n" + n3 + "\n" + n2 + "\n\n" + n1 + "\n" + n2 + "\n" + n3);
                    }
                } else if (n2 <= n1 && n2 <= n3) {
                    if (n1 <= n3) {
                        System.out.println(n2 + "\n" + n1 + "\n" + n3 + "\n\n" + n1 + "\n" + n2 + "\n" + n3);
                    } else {
                        System.out.println(n2 + "\n" + n3 + "\n" + n1 + "\n\n" + n1 + "\n" + n2 + "\n" + n3);
                    }
                } else {
                    if (n1 <= n2) {
                        System.out.println(n3 + "\n" + n1 + "\n" + n2 + "\n\n" + n1 + "\n" + n2 + "\n" + n3);
                    } else {
                        System.out.println(n3 + "\n" + n2 + "\n" + n1 + "\n\n" + n1 + "\n" + n2 + "\n" + n3);
                    }
        
        scanner.close();
    }
}
}