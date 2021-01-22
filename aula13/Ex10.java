/*
Faça um program que peça a temperatura em graus Ceslsius, transforme e mostre em graus Farenheit
*/

import java.util.Scanner;

public class Ex10
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = scan.nextDouble();
        double farenheit = celsius*1.8 + 32;

        System.out.println("O valor em Farenheit é de " +farenheit);
    }
}
