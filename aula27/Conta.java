public class Conta
{
    int numero;
    double saldo;
    boolean especial;
    double limite;
    
    void realizarSaque(double saque)
    {
        if(saque<=saldo)
        {
            System.out.println("Realizado o saque de: RS" + saque);
            saldo -=saque;
        }
        else
        {
            if (especial && (limite-saldo)>=saque)
            {
                saldo -=saque;
                System.out.println("Realizado o saque de: RS" + saque);
            }
            else 
                System.out.println("Não é possível realizar o saque no valor de R$" +saque);
        }
    }

    void depositarDinheiro(double deposito)
    {
        System.out.println("Realizado o deposito no valor de R$ "+deposito);
        saldo += deposito;
        consultarSaldo();
    }

    void consultarSaldo()
    {
        System.out.println("O saldo é de R$ " + saldo);
        if (especial) 
        {
            if(saldo<0)
                System.out.println("Está usando R$" + saldo*(-1) + " do limite especial de R$ " +limite);
            else
                System.out.println("Não está usando o limite especial.");
        }
        else 
            System.out.println("Não possui limite especial");
    }

}
