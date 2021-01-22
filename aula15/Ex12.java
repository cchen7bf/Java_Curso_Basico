/*
Faça um programa para o cáculo de uma folha de pagamento, sabendo que os descontos são do IR, que depende do salário bruto(conforme tabela abaixo) e 3% para o Sincicato e que o FGTS corresponde a 11%, mas não é descontado(é a empresa que deposita). O salário líquido corresponde ao salário bruto menos os descontos. O programa deverá pedir ao usuário o valor a sua hora e a quantidade de horas trabalhadas no mês.
    -Desconto do IR:
        - Salário Bruto até 900(inclusive) - isento.
        - Salário Bruto até 1500(inclusive) - desconto de 5%.
        - Salário Bruto até 2500(inclusive) - desconto de 10%.
        - Salário Bruto acima de 2500 - desconto de 20%.
    Imprima na tela as informações, dispostas conforme o exemplo abaixo. No exemplo o valor da hora é de 5 e a quatidade de horas é 220.
 
    Salário Bruto (5 * 220)     : R$ 1100,00
    (-) IR (5%)                 : Rs   55,00
    (-) INSS (10%)              : R$  110,00
    FGTS (11%)                  : R$  121,00
    Salário Líquido             : R$  935,00
    Total de descontos          : R$  165,00
*/

import java.util.Scanner;

public class Ex12
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o seu salário por hora: ");
        double preco = scan.nextDouble();

        System.out.println("Digite as horas trabalhadas: ");
        double hora = scan.nextDouble();
        double porcentagem = 0;

        double salario = preco*hora;

        if (salario>900 && salario<=1500) porcentagem = 0.05;
        else if(salario>1500 && salario<=2500) porcentagem = 0.10;
        else if (salario>2500) porcentagem = 0.20;

        double imposto = salario*porcentagem;
        double inss = salario*0.10;
        double fgts = salario*0.11;
        double descontos = inss+imposto;

        System.out.println("Salário Bruto ("+hora+" * "+preco+"): R$ "+salario);
        System.out.println("(-) IR ("+porcentagem*100+"%) : R$ "+imposto);
        System.out.println("(-) INSS ("+inss+"%) : R$ "+inss);
        System.out.println("Salário Liquido : R$ "+(salario-descontos));
        System.out.println("Total de descontos : R$ "+descontos);
        
    }
}
