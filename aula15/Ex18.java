/*
Faça um programa que peça um número inteiro e determine se ele é par ou impar.
*/

import java.util.Scanner;

public class Ex18
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scan.nextInt();

        if (numero%2==0)    System.out.println("O número é par.");
        else System.out.println("O número é impar.");
    }
}
