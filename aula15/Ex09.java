/*
Faça um programa que pergunte em que turno você estuda. Peça para digitar M-Matutino ou V-Vespertino ou N-Noturno. Imprima a mensagem "Bom Dia", "Boa Tarde", "Boa Noite" ou "Valor inválido".
*/

import java.util.Scanner;

public class Ex09
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite em qual período você estuda (M, V, N): ");
        String periodo = scan.next();

        if (periodo.equalsIgnoreCase("m"))
            System.out.println("Bom Dia");
        else if (periodo.equalsIgnoreCase("v"))
            System.out.println("Boa Tarde");
        else if (periodo.equalsIgnoreCase("n"))
            System.out.println("Boa Noite");
        else
            System.out.println("Valor inválido");
    }
}
