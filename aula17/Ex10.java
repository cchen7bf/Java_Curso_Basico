/*
Faça um programa que receba dois npumeros inteiros e gere os números inteiros que estão no intervalo compreendido por eles.
*/

import java.util.Scanner;

public class Ex10
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        int n2 = scan.nextInt();

        while (n1<n2)
        {
            System.out.println(n1);
            n1++;
        }

    }
}
