/*
Criar um vetor A com 8 elementos inteiros. Construir um vetor V de mesmo tipo e tamanho e como elementos do vetor A multiplicados por 2, B[i] = A[i]*2.
*/

import java.util.Scanner;

public class Ex02
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[8];
        int[] vetorB = new int[8];

        for (int i=0; i<8; i++)
        {
            System.out.println("Digite o valor do vetor: ");
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i]*2;
        }


        System.out.print("Vetor A = ");
        for (int i=0; i<8; i++)
        {
            System.out.print(vetorA[i]+" ");
        }
        System.out.println();
        
        System.out.print("Vetor B = ");
        for (int i=0; i<8; i++)
        {
            System.out.print(vetorB[i]+" ");
        }
    }
}
