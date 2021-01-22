/*
Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimentos iniciais. Valide a entrada e permita repetir a operação.
*/

import java.util.Scanner;

public class Ex05
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        boolean valido = false;
        double popA;
        double porcA;
        double popB;
        double porcB;
        int cont=0;

        do
        {
            System.out.println("Digite a população A: ");
            popA = scan.nextDouble();
            if (popA<=0)    System.out.println("População inválida");
            else valido = true;
        } while(!valido);

            valido = false;

        do
        {
            System.out.println("Digite a taxa de crescimento de A: ");
            porcA = scan.nextDouble();
            if (porcA<=0)    System.out.println("Porcentagem inválida");
            else valido = true;
        } while(!valido);

            valido = false;

        do
        {
            System.out.println("Digite a população B: ");
            popB = scan.nextDouble();
            if (popB<=0)    System.out.println("População inválida");
            else valido = true;
        } while(!valido);

            valido = false;
        do
        {
            System.out.println("Digite a taxa de crescimento de B: ");
            porcB = scan.nextDouble();
            if (porcB<=0)    System.out.println("Porcentagem inválida");
            else valido = true;
        } while(!valido);


        while (popA<popB)
        {
            popA += popA*(porcA/100);
            popB += popB*(porcB/100);
            cont++;
        }

        System.out.println("O número de anos é "+cont);
    }
}
