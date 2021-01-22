/*
Faça um programa que verifique se uma letra digitada '"F" ou "M". Conforme a letra escrever: F - Feminimo, M - Masculino, Sexo Inválido.
*/

import java.util.Scanner;

public class Ex03
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 'F' ou 'M'");
        String letra = scan.next();

        if (letra.equalsIgnoreCase("f"))
            System.out.println("Feminino");
        else if(letra.equalsIgnoreCase("m"))
            System.out.println("Masculino");
        else
            System.out.println("Sexo inválido");
    }
}
