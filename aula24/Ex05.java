/*
Cria uma classe para representar uma conta corrente que possui um número, saldo, status que informa se ela é especial ou não, limite.
*/

public class Ex05
{
    public static void main(String[] args)
    {
        ContaCorrente conta = new ContaCorrente();
        conta.numero = "123";
        conta.agencia = "555";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.saldo = -10;

        System.out.println("Saldo da conta = "+conta.saldo);
    }
}
