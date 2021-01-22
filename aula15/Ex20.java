/*
Faça um programa que faça 5 perguntas para uma pessoa sobre um crime:
    - Telefou para a vítima?
    - Esteve no local do crime?
    - Mora perto da vítima?
    - Devia para a vítima?
    - Já trabalhou com a vítima?

O programa deve emitir uma classificção dobre a participação do crime.
2 - suspeito
3-4 cúmplice
5 - assassino
caso contrário - inocente
*/

import java.util.Scanner;

public class Ex20
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int contador = 0;
        System.out.println("Telefonou para a vítima? (sim/nao):");
        String resp1 = scan.next();

        System.out.println("Esteve no local do crime? (sim/nao):");
        String resp2 = scan.next();

        System.out.println("Mora perto da vítima? (sim/nao):");
        String resp3 = scan.next();

        System.out.println("Devia para a vítima? (sim/nao):");
        String resp4 = scan.next();

        System.out.println("Já trabalhou com a vítima? (sim/nao):");
        String resp5 = scan.next();

        if (resp1.equalsIgnoreCase("sim"))  contador++;
        if (resp2.equalsIgnoreCase("sim"))  contador++;
        if (resp3.equalsIgnoreCase("sim"))  contador++;
        if (resp4.equalsIgnoreCase("sim"))  contador++;
        if (resp5.equalsIgnoreCase("sim"))  contador++;

        switch (contador)
        {
            case 2: System.out.println("Suspeito"); break;
            case 3: 
            case 4: System.out.println("Cúmplice"); break;
            case 5: System.out.println("Assassino"); break;
            default: System.out.println("Inocente"); break;
        }
    }
}
