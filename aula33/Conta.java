public class Conta
{
    private int numero;
    private double saldo;
    private boolean especial;
    private double limite;
    

    public Conta(int numero, double saldo, boolean especial, double limite)
    {
        this.numero = numero;
        this.saldo = saldo;
        this.especial = especial;
        this.limite = limite;
    }

    public int getNumero()
    {
        return numero;
    }

    public void setNumero (int numero)
    {
        this.numero = numero;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public void setSaldo (double saldo)
    {
        this.saldo = saldo;
    }

    public boolean isEspecial()
    {
        return especial;
    }

    public void setEspecial (boolean especial)
    {
        this.especial = especial;
    }

    public double getLimite()
    {
        return limite;
    }

    public void setLimite (int limite)
    {
        this.limite = limite;
    }

    public void realizarSaque(double saque)
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

    public void depositarDinheiro(double deposito)
    {
        System.out.println("Realizado o deposito no valor de R$ "+deposito);
        saldo += deposito;
        consultarSaldo();
    }

    public void consultarSaldo()
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
