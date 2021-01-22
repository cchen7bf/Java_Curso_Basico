/*
Gere e imprima uma matriz 4x4 com valores aleatórios entre 0-9. Após isso determine o aior número da matriz e a sua posição.
*/

import java.util.Random;

public class Ex01
{
    public static void main(String[] args)
    {
        int[][] matrizM = new int[4][4];
        Random numero = new Random();
        int maior = 0;
        int linha = 0;
        int col = 0; 

        for (int i=0; i<matrizM.length; i++)
        {
            for (int j=0; j<matrizM[i].length; j++)
            {
                matrizM[i][j] = numero.nextInt(100);
                if (matrizM[i][j] > maior)
                {
                maior = matrizM[i][j];
                linha = i;
                col = j;
                }
            }
        }

        for (int i=0; i<matrizM.length; i++)
        {
            for (int j=0; j<matrizM[i].length; j++)
            {
                System.out.print(matrizM[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Maior : "+maior);
        System.out.println("linha : "+linha);
        System.out.println("Coluna : "+col);
    }
}
