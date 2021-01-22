/*
Altere o programa anterior para mostrar no final a soma dos números
*/

import java.util.Scanner;

public class Ex11
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int soma=0;

        System.out.println("Digite o primeiro número: ");
        int n1 = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        int n2 = scan.nextInt();

        while (n1<n2)
        {
            soma +=n1;
            n1++;
        }
            System.out.println(soma);
    }
}
