/*
Faça um programa que leia 2 números e em seguida pergunte qual operação ele deseja realizar. O resultado da operação deve ser acompanhado de uma frase se ele é impar ou par; positivo ou negativo.
*/

import java.util.Scanner;

public class Ex19
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double n1 = scan.nextDouble();

        System.out.println("Digite o segundo número: ");
        double n2 = scan.nextDouble();

        System.out.println("Entre com a operação (+ - / *)");
        String operacao = scan.next();

        double resultado = 0;
        boolean valida = true;

        switch(operacao)
        {
            case "+": resultado = n1+n2; break;
            case "-": resultado = n1-n2; break;
            case "*": resultado = n1*n2; break;
            case "/": resultado = n1/n2; break;
            default: System.out.println("Operação inválida"); valida = false;
        }
        System.out.println("Resultado: "+resultado);

        if (valida)
        {
            if(resultado%2 == 0) System.out.println("par");
            else System.out.println("impar");

            if(resultado>=0) System.out.println("positivo");
            else System.out.println("negativo");
        }

    }

}
