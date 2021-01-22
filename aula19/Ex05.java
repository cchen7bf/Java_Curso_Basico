/*
Criar um vetor A com 10 elementos inteiros. Construir um vetor B do mesmo tipo e tamanho, sendo que B[i] = A[i]*i.
*/

import java.util.Scanner;

public class Ex05
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int vetorA[] = new int[10];
        int vetorB[] = new int[10];

        for (int i=0; i<10; i++)
        {
            System.out.println("Digite um número do vetor: ");
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i]*i;
        }

        System.out.print("Vetor A = ");
        for (int i=0; i<10; i++)
        {
            System.out.print(vetorA[i]+ " ");
        }

        System.out.println();

        System.out.print("Vetor B = ");
        for (int i=0; i<10; i++)
        {
            System.out.print(vetorB[i]+ " ");
        }
    }
}
