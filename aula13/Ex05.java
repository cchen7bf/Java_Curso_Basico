/*
Faça um programa que converta metros em centímetros
*/

import java.util.Scanner;

public class Ex05
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número em metros: ");
        double metros = scan.nextDouble();

        double centimetros = metros*100;
 
        System.out.println("O valor em centímetros é " +centimetros);
    }
}
