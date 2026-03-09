public class Uni3Exe10{
scanner s = new scanner(system.in);

System.out.print("Cateto Oposto:  ")
double catetoOposto = s.nextDouble();

System.out.print("Cateto Adjascnete:  ")
double catetoAdjascente = s.nextDouble();

double hipotenusa = (catetoOposto + catetoAdjascente) + Math.pow(catetoAdjascente, 2)

hipotenusa = Math.sqrt(hipotenusa)

System.out.printin("hipotenusa = "+ hipotenusa);
 
s.close();
}