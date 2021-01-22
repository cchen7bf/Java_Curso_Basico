/*
Um posto está vendendo combustíveis com a seguinte tabela de descontos:
Álcool:
    - até 2 litros, desconto de 3% por litro.
    - acima de 20 litros, desconto de 5% por litro.
Gasolina:
    - até 20 litros, desconto de 4% por litro.
    - acima de 20 litros, desconto de 6% por litro.

Escreva um programa que leia o número de litros vendidos, o tipo de combustível, calcule e imprima o valor a ser pago.
Sabendo-se que o preço da gasolina é de R$2,50 e o álcool é de R$1,90.
*/

import java.util.Scanner;

public class Ex21
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de litros: ");
        double litros = scan.nextInt();
        System.out.println("Digite o tipo de combustível (A/G): ");
        String combustivel = scan.next();
        double desconto = 0;
        double taxa = 0;
        if (combustivel.equalsIgnoreCase("a"))
        {
            taxa = 1.90;
            if (litros<=20) desconto = 0.03;
            else desconto = 0.05;
        }
        else if (combustivel.equalsIgnoreCase("g"))
        {
            taxa = 2.50;
            if (litros<=20) desconto = 0.04;
            else desconto = 0.06;
        }
        double valor = (litros*taxa)-(litros*taxa*desconto);
        System.out.println("O valor a ser pago é: "+valor);
    }
}
