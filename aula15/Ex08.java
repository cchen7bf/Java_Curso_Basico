/*
Faça um programa que pergunte o preço de 3 produtos e informe qual o produto você deve comprar, sabendo que a decisão é sempre pelo mais barato
*/

import java.util.Scanner;

public class Ex08
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Digite o preço do primeiro produto: ");
        int n1 = scan.nextInt();

        System.out.println("Digite o preço do segundo produto: ");
        int n2 = scan.nextInt();

        System.out.println("Digite o preço do terceiro produto: ");
        int n3 = scan.nextInt();

        int maior = n1;
        int menor = n1;

        if (n2>maior)
            maior = n2;
        if (n2<menor)
            menor = n2;
        if (n3>maior)
            maior = n3;
        if (n3<menor)
            menor =n3;

        if (menor==n1)
            System.out.println("Compre o primeiro produto");
        else if(menor==n2)
            System.out.println("Compre o segundo produto");
        else
            System.out.println("Compre o terceiro produto");
        
    }
}
