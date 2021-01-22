/*
Supondo que a população de um país A seja 80 000, com taxa anual de crescimento de 3% e que a pooulação B seja 200 000 com uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B.
*/

import java.util.Scanner;

public class Ex04
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        double popA = 80000;
        double popB = 200000;
        double porcA = 1.03;
        double porcB = 1.015;
        int cont=0;

        while (popA<popB)
        {
            popA = popA*porcA;
            popB = popB*porcB;
            cont++;
        }

        System.out.println("O número de anos é "+cont);
    }
}
