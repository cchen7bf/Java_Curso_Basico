/*
Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média e apresentar:
    - A mensagem "Aprovado", se a média for maior ou igual a 7;
    - A mensagem "Reprovado", se a média for menor que 7;
    - A mensagem "Aprovado com Distinção", se a média for igual a 10.
*/

import java.util.Scanner;

public class Ex05
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double n1 = scan.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double n2 = scan.nextDouble();

        double media = (n1+n2)/2;

        System.out.println("Média: "+media);

        if (media==10)
            System.out.println("Aprovado com Distinção");
        else if (media>=7)
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");

    }
}
