/*
Criar um vetor A com 15 elementos inteiros. Construir um vetor B com mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá ser o quadrado do respectivo elemento de A, B[i]= A[i]*A[i]
*/

import java.util.Scanner;

public class Ex03
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[15];
        int[] vetorB = new int[15];

        for (int i=0; i<15; i++)
        {
            System.out.println("Digite o valor do vetor: ");
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i]*vetorA[i];
        }

        System.out.print("Vetor A = ");
        for (int i=0; i<15; i++)
            System.out.print(vetorA[i]+" ");

        System.out.println();

        System.out.print("Vetor B = ");
        for (int i=0; i<15; i++)
            System.out.print(vetorB[i]+" ");
    }
}
