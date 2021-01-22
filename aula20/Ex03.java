/*
Capture do teclado valores para preenchimeto de uma matriz M 3x3. Após imprima a matriz criada e enconte a quantidade de números pares e ímpares.
*/

import java.util.Scanner;

public class Ex03
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int matriz[][] = new int[3][3];
        int par = 0;
        int impar = 0;

        for (int i=0; i<matriz.length; i++)
        {
            for (int j=0; j<matriz[i].length; j++)
            {
                System.out.println("Digite o valor da matriz: ");
                matriz[i][j] = scan.nextInt();
                if (matriz[i][j]%2==0)  par++;
                else impar++;
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
        System.out.println("O números de pares é: "+par);
        System.out.println("O números de impares é: "+impar);
    }
}
