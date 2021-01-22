/*
Faça um programa que peça o raio de um círculo, calcule e mostre a sua área.
*/

import java.util.Scanner;

public class Ex06
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do raio: ");
        double raio = scan.nextDouble();

        double area = Math.PI * Math.pow(raio,2);

        System.out.println("O valor da área é " +area);
    }
}
