/*
Faça um programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário
*/

import java.util.Scanner;

public class Ex07
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Digite o lado do quadrado: ");
        double lado = scan.nextDouble();

        double dobro_area = 2*(lado*lado);

        System.out.println("O dobro do valor da área é " +dobro_area);
    }
}
