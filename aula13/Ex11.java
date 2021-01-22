/*
Faça um programa que peça 2 números inteiros e um número real.
Calcule e mostre:
    a-) o produto do dobro do primeiro com a metade do segundo.
    b-) a soma do triplo do primeiro com o terceiro.
    c-) o terceiro elevado ao cubo.
*/

import java.util.Scanner;

public class Ex11
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int n1 = scan.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int n2 = scan.nextInt();
        System.out.println("Digite um número real: ");
        double n3 = scan.nextDouble();

        int    respA = (n1*2)*(n2/2);
        double respB = (3*n1)+n3;
        double respC = Math.pow(n3,3);

        System.out.println("a= "+respA+ ", b= " +respB+ ", c= "+respC);
    }
}
