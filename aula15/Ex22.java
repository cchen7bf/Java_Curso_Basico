/*
Um mercadoo está vendendo frutas com o seguinte preço:
            até 5kg         acimda de 5kg
morango     2,50/kg          2,20/kg
maçã        1,80/kg          1,50/kg

Se o cliente comprar mais de 8kg ou o valor total ultrapassar R$25,00, receberá um desconto de 10%.
Escreva um programa que leia a quantidade de morandos e maças, e escreva o valor pago.
*/

import java.util.Scanner;

public class Ex22
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de morango: ");
        double morango = scan.nextDouble();
        System.out.println("Digite a quantidade de maçã: ");
        double maca = scan.nextDouble();

        double totalmorango = 0;
        double totalmaca = 0;

        if (morango<=5) totalmorango = morango*2.50;
        else if (morango>5) totalmorango = morango*2.20;

        if (maca<=5) totalmaca = maca*1.80;
        else if (maca>5) totalmaca=maca*1.50;

        double total = totalmaca+totalmorango;

        if (total>25 || (morango+maca)>8) total = total - (total*0.10);

        System.out.println("Total: "+total);
    }
}
