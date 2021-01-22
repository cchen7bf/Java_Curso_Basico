/*
Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no mês referido
*/

import java.util.Scanner;

public class Ex08
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da hora trabalhada: ");
        double salario = scan.nextDouble();
        System.out.println("Digite o valor das horas trabalhadas no mês: ");
        int horas = scan.nextInt();

        double valor = salario*horas;

        System.out.println("O salário do mês é R$" +valor);        
    }
}
