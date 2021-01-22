/*
Faça um programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo. Indique, caso os lados formem um triângulo: equilátero, isósceles ou escaleno.
*/

import java.util.Scanner;

public class Ex15
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro lado do triângulo: ");
        double l1 = scan.nextDouble();
        System.out.println("Digite o segundo lado do triângulo: ");
        double l2 = scan.nextDouble();
        System.out.println("Digite o terceiro lado do triângulo: ");
        double l3 = scan.nextDouble();

        if (l1+l2>l3 && l2+l3>l1 && l1+l3>l2)
        {
            System.out.println("Os lados formam um triângulo");        
            if (l1!=l2 && l2!=l1 && l2!=l3)
                System.out.println("Escaleno");
            else if (l1==l2 && l2==l3 && l1==l3)
                System.out.println("Equilátero");
            else
                System.out.println("Isósceles");
        }
        else
            System.out.println("Os lados não forma um triângulo");
    }
}
