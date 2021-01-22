/*
Faça um programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius.
*/

import java.util.Scanner;

public class Ex09
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em Farenheit: ");
        double farenheit = scan.nextDouble();

        double celsius = (5*(farenheit-32)/9);

        System.out.println("A temperatura em Celsius é " +celsius);
    }
}
