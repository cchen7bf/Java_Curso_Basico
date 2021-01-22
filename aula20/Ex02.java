/*
Gere e imprima uma matriz M 10x10 com valores aleatórios ente 0-100. Após isso indique qual é o maior e o menor da linha 5 e qual é o maior e o menor da coluna 7.
*/

import java.util.Random;

public class Ex02
{
    public static void main (String[] args)
    {
        Random numero = new Random();

        int[][] matriz = new int[10][10];

        int maior5 = 0;
        int menor5 = 101;
        int maior7 = 0;
        int menor7 = 101;

        for (int i=0; i<matriz.length; i++)
        {
            for (int j=0; j<matriz[i].length; j++)
            {
                matriz[i][j] = numero.nextInt(100);
                if (i==5)
                {
                    if (matriz[5][j]>maior5)
                        maior5 = matriz[5][j];
                    if (matriz[5][j]<menor5)
                        menor5 = matriz[5][j];
                }
                else if (j==7)
                {                
                    if (matriz[i][7]>maior7)
                        maior7 = matriz[i][7];
                    if (matriz[i][7]<menor7)
                        menor7 = matriz[i][7];
                }
            }
        }

        for (int i=0; i<matriz.length; i++)
        {
            for (int j=0; j<matriz[i].length; j++)
            {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Maior da linha 5: " +maior5);
        System.out.println("Menor da linha 5: " +menor5);
        System.out.println("Maior da coluna 7: " +maior7);
        System.out.println("Menor da coluna 7: " +menor7);

    }
}
