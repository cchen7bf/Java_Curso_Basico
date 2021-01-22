/*
Faça um programa que lê duas notas parciais, e calcule a sua média.
Entre 9.0 e 10.0    A
Entre 7.5 e 9.0     B
Entre 6.0 e 7.5     C
Entre 4.0 e 6.0     D
Entre 4.0 e 0.0     E

O algoritimo deve mostrar na tela as notas, a média, o conceito e a mensagem "APROVADO" se o conceito for A, B ou C e "REPROVADO" se o conceito for D ou E.
*/

import java.util.Scanner;

public class Ex14
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double n1 = scan.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double n2 = scan.nextDouble();

        double media = (n1+n2)/2;

        System.out.println("nota 1: "+n1);
        System.out.println("nota 2: "+n2);
        System.out.println("média: "+media);

        if (media >= 9) System.out.println("conceito: A");
        else if (media>=7.5 && media<9) System.out.println("conceito: B");
        else if (media>=6 && media<7.5) System.out.println("conceito: C");
        else if (media>=4 && media<6) System.out.println("conceito: D");
        else if (media>=0 && media<4) System.out.println("conceito: E");

        if (media>=6) System.out.println("APROVADO");
        else System.out.println("REPROVADO");
    }
}
