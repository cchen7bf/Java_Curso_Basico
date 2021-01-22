/*
Faça um programa que leia 3 números e mostre o maior deles.
*/

import java.util.Scanner;

public class Ex06
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Digite o primeiro número: ");
        int n1 = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        int n2 = scan.nextInt();

        System.out.println("Digite o terceiro número: ");
        int n3 = scan.nextInt();

        int maior = n1;

        if (n2>maior)
            maior = n2;
        if (n3>maior)
            maior = n3;

        System.out.println("O maior número é: "+maior);
    }
}
