/*
Faça um programa que pergunte quanto você ganha por hora e o seu número de horas trabalhadas no mês. Calcule e mostre seu total do seu salário no referido mes, sabendo que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
    -salário bruto
    -quanto pagou ao sindicato
    -salário líquido
    -calcule os descontos e o salário liquido, conforme a tabela abaixo.
    Salario liquido = Salario bruto - IR - INSS - Sindicato
*/

import java.util.Scanner;

public class Ex13
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da hora trabalhada: ");
        double porhora = scan.nextDouble();
        System.out.println("Digite o valor das horas trabalhadas no mês: ");
        int horas = scan.nextInt();

        double salario = porhora*horas;
        double ir = salario*0.11;
        double inss = salario*0.08;
        double sindicato = salario*0.05;
        double liquido = salario - ir - inss - sindicato;
        System.out.println("O salário bruto do mês é R$" +salario);
        System.out.println(sindicato+"foi pago ao sindicato.");
        System.out.println("O salário líquido é de "+liquido);      
    }
}
