/*
Faça um programa que leia 5 números e informe o maior número.
*/

import java.util.Scanner;

public class Ex07
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scan.nextInt();
        int maior = numero;
        int cont = 1;

        while (cont<5)
        {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            cont++;
            if (numero>maior) maior = numero;
        }
        System.out.println("O maior número é "+maior);
    }

}

