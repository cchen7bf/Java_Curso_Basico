public class Lampada
{
    private String marca;
    private int potencia;
    private boolean status=false;

    public Lampada(String marca, int potencia, boolean status)
    {
        this.marca = marca;
        this.potencia = potencia;
        this.status = status;
    }

    public String getMarca()
    {
        return marca;
    }
    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public int getPotencia()
    {
        return potencia;
    }

    public void setPotencia(int potencia)
    {
        this.potencia = potencia;
    }
    public Lampada(String marca, int potencia)
    {
        this.marca = marca;
        this.potencia = potencia;
    }

    public boolean isStatus()
    {
        return status;
    }

    public void setStatus(boolean status)
    {
        this.status = status;
    }

    public void ligar()
    {
        setStatus(true);
    }

    public void desligar()
    {
        setStatus(false);
    }

    public void mostrarEstado()
    {
        if(isStatus())
            System.out.println("A lâmpada está ligada");
        else
            System.out.println("A lâmpada está desligada");
    }
}
