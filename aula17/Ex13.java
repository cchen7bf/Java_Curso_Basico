/*
Faça um programa que peça dois números, base e expoente, calcule o mostre o primeiro numero elevado ao segundo número. não utilize a função de potencia da linguagem.
*/

import java.util.Scanner;

public class Ex13
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a base: ");
        int base = scan.nextInt();

        System.out.println("Digite o expoente: ");
        int expoente = scan.nextInt();

        int cont =1;
        int total=1;

        while (cont<=expoente)
        {
            total *= base;
            cont++;
        }
        System.out.println(total);
    }
}
