/*
Crira um vetor A com 15 elementos inteiros. Construir um vetor B com o mesmo tipo e tamanho, sendo b[i] = sqrt(A[i])
*/

import java.util.Scanner;
import java.lang.Math;

public class Ex04
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,###.###");
        int[] vetorA = new int[15];
        double[] vetorB = new double[15];

        for (int i=0; i<15; i++)
        {
            System.out.println("Digite o valor do vetor: ");
            vetorA[i] = scan.nextInt();
            vetorB[i] = Math.sqrt(vetorA[i]);
        }

        System.out.print("Vetor A = ");
        for (int i=0; i<15; i++)
            System.out.print(vetorA[i]+" ");

        System.out.println();

        System.out.print("Vetor B = ");
        for (int i=0; i<15; i++)
            System.out.print(df.format(vetorB[i]+" "));
    }
}
