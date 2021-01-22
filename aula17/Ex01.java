/*
Faça um progra,a que peça uma nota, entre 0 e 10. Mostre uma mensagem, caso o valor seja inválido e continue pedindo.
*/

import java.util.Scanner;

public class Ex01
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma nota entre 0-10: ");
        double nota = scan.nextDouble();

        while (nota<0 || nota>10)
        {
            System.out.println("Digite uma nota entre 0-10: ");
            nota = scan.nextDouble();
        }
        System.out.println("Nota: "+nota);
    }
}
