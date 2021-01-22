/*
Faça um programa que leia 5 números e informe a soma e a média dos números.
*/

import java.util.Scanner;

public class Ex08
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int soma = 0;
        int numero;
        int cont = 0;

        while (cont<5)
        {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            soma += numero;
            cont++;
        }
        System.out.println("Soma: " +soma);
        System.out.println("Média: " +soma/5);
    }
}
