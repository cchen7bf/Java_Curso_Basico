/*
As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contrataram para desenvolver o programa que calculará os reajustes.
    -Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual.
    - salários até R$280,00(incluindo): aumento de 20%;
    - salários entre R$280,00 e R$700(incluindo): aumento de 15%
    - salários entre R$700,00 e R$1500(incluindo): aumento de 10%
    - salários de R$1500,00 em diante: aumento de 5%;
    Após o aumento ser realizado, informe na tela?
    - o salário antes do reajuste;
    - o percentual de aumento aplicado;
    - o valor do aumento;
    - o novo salário, após o aumento.
*/

import java.util.Scanner;

public class Ex11
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do salário: ");
        double salario = scan.nextDouble();
        double aumento = 0;

        if (salario<=280) 
            aumento = 0.2;
        else if (salario>280 && salario<=700) 
            aumento = 0.15;
        else if (salario>700 && salario<=1500) 
            aumento = 0.10;
        else 
            aumento = 0.05;

        double novo = salario*aumento+salario;

        System.out.println("Salario anterior: "+salario);
        System.out.println("Ajuste aplicado: "+aumento*100);
        System.out.println("Valor do aumento: "+aumento*salario);
        System.out.println("Novo salário: "+novo);
    
    }
}
