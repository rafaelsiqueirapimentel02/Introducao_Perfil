public class Uni3Exe12{

    public static void main(string[] args) throws Exception{

        System.out.print("Nome: ")
        double Nome = s.nextDouble();

        System.out.print("Horas Trabalhadas: ")
        double Horas = s.nextDouble();

        System.out.print("Número de Dependentes: ")
        double Dependentes = s.nextDouble();

        double salariobase = (Horas * 10);
        double salariofamilia = (Dependentes * 60);
        double salariobruto = (salariobase + salariofamilia);

        double inss = (salariobase * 0.085);
        double imposto = (salariobase * 0.05);
        double salarioliquido = (salariobruto - inss - imposto);

        System.out.print("O funcionário " + Nome, "possui um salário bruto de " + salariobruto, " e um salário liquido de " + salarioliquido);

        s.close();
    }
}
