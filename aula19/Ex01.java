/*
Criar um vetor A com 5 elementos inteiros. Construir um vetor B igua ao vetor A. B[i]=A[i].
*/

import java.util.Scanner;

public class Ex01
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        for (int i=0; i<5; i++)
        {
            System.out.println("Digite o valor do vetor ["+i+"]");
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i];
        }
        System.out.print("Vetor A = ");
        for (int i=0; i<5;i++)
        {
            System.out.print(vetorA[i]+" ");
        }
        System.out.println();
        System.out.print("Vetor B = ");
        for (int i=0; i<5;i++)
        {
            System.out.print(vetorB[i]+" ");
        }
    }
}
