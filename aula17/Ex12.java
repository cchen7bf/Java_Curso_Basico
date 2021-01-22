/*
Desenvolva um gerador de tabuada. O usuário informa qual a tabuaba ele quer.
*/

import java.util.Scanner;

public class Ex12
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número da tabuada: ");
        int numero = scan.nextInt();

        int cont=1;

        System.out.println("Tabuada de "+numero+":");
        while (cont<=10)
        {
            System.out.println(numero+" x "+cont+" = "+numero*cont);
            cont++;
        }
    }
}
