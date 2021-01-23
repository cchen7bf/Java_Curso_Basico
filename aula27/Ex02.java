/*
Cria uma classe para representar uma conta corrente que possui um número, um saldo, um status que informa se ela é especial ou não, um limite. 
Desenvolva métodos para realizar saque (verificando se o cliente pode realizar saques), depositar dinheiro, consultar saldo e verificar se o cliente está usando cheque especial ou não. Desenvolva um programa para testar essa classe.
*/

public class Ex02
{
    public static void main(String[] args)
    {
        Conta pedro =new Conta();
        pedro.numero = 12345;
        pedro.saldo = -10;
        pedro.especial = true;
        pedro.limite = 100;
    

        pedro.realizarSaque(50);
        pedro.consultarSaldo();
        pedro.realizarSaque(200);
        pedro.consultarSaldo();
        pedro.depositarDinheiro(100);

    }
}
