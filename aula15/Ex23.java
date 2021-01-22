/*
O hipermercado está com uma promoção

            Até 5kg         Acima de 5kg
Filé Duplo  4,90/kg         5,80/kg
Alcatra     5,90/kg         6,80/kg
Picanha     6,90/kg         7,80/kg

Cada cliente poderá levar apenas um dos tipos de carne da promoção.
Compras no cartão tem 5% de desconto.
Escreva um programa que peça o tipo e quantidade de carne.
Gere um cupom fiscal, contendo as informações: tipo e qtd de carne, tipo de pagamento, valor do desconto e valor a pagar.
*/

import java.util.Scanner;

public class Ex23
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tipo da carne (F-File Duplo, A-Alcatra, P-Picanha): ");
        String tipo = scan.next();

        System.out.println("Digite a quantidade: ");
        double qtd = scan.nextDouble();

        System.out.println("Digite o tipo de pagamento(C-cartão, D-dinheiro): ");
        String pagamento = scan.next();

        double desconto = 0;
        double total = 0;

        if (tipo.equalsIgnoreCase("f"))
            if (qtd<=5) desconto = 4.90;
            else desconto = 5.80;
        else if (tipo.equalsIgnoreCase("a"))
            if (qtd<=5) desconto = 5.90;
            else desconto = 6.80;
        else if (tipo.equalsIgnoreCase("p"))
            if (qtd<=5) desconto = 6.90;
            else desconto = 7.80;

        if (pagamento.equalsIgnoreCase("c"))
            total = (qtd*desconto)*0.95;
        else    total = (qtd*desconto);

        System.out.println("Tipo: "+tipo);
        System.out.println("Quantidade: "+qtd+"kg");
        System.out.println("Tipo de pagamento: "+pagamento);
        System.out.println("Valor a pagar: R$"+total);


    }
}
