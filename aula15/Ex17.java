/*
Faça um programa que peça o número correpondente a um determinado ano e em seguida informe se este ano é ou não bissexto.
*/

import java.util.Scanner;

public class Ex17
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o ano: ");
        int ano = scan.nextInt();

        if ((ano%4==0 && ano%100!=0) || ano%400==0)
            System.out.println("O ano é bissexto");
        else
            System.out.println("O ano não é bissexto");        
    }
}
