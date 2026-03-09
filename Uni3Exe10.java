import java.util.Scanner;

public class Uni3Exe10{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

System.out.print("Cateto Oposto:  ");                    
double catetoOposto = s.nextDouble();

System.out.print("Cateto Adjascnete:  ");                                                           
double catetoAdjascente = s.nextDouble();

double hipotenusa = (catetoOposto + catetoAdjascente) + Math.pow(catetoAdjascente, 2);

hipotenusa = Math.sqrt(hipotenusa);

System.out.println("hipotenusa = "+ hipotenusa);
 
s.close();

}

}