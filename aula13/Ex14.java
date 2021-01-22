/*
Faça um programa que peça o tamanho de um arquivo para download (em Mb) e a velocidade de um link de internet (em Mbps), calucle e informe o tempo aproximado de download do arquivo isando este link (em minutos).
*/

import java.util.Scanner;

public class Ex14
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do arquivo: ");
        double arquivo = scan.nextDouble();
        System.out.println("Digite a velocidade do link: ");
        double velocidade = scan.nextDouble();

        double tempo = (arquivo/velocidade);

        System.out.println("O tempo de download é de: " +tempo+ " minutos.");
    }
}
