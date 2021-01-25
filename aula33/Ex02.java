/*
Reescreva os exercicios, criando todos os atributos do tipo privado, métodos getters e setters e construtores. Os métodos que serão utilizados pela classe de teste devem ser públicos. Se necessário, crie métodos privados como auxiliares para organizar o código fonte.

Cria uma classe para representar uma conta corrente que possui um número, um saldo, um status que informa se ela é especial ou não, um limite. 
Desenvolva métodos para realizar saque (verificando se o cliente pode realizar saques), depositar dinheiro, consultar saldo e verificar se o cliente está usando cheque especial ou não. Desenvolva um programa para testar essa classe.
*/

public class Ex02
{
    public static void main(String[] args)
    {
        Conta pedro = new Conta(12345, -10, true, 100);
/*      pedro.setNumero(12345);
        pedro.setSaldo(-10);
        pedro.setEspecial(true);
        pedro.setLimite(100);
  */  

        pedro.realizarSaque(50);
        pedro.consultarSaldo();
        System.out.println();
        pedro.realizarSaque(200);
        pedro.consultarSaldo();
        System.out.println();
        pedro.depositarDinheiro(100);

    }
}
