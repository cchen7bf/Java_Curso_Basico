/*
Crie uma classe que represente um contato da agenda do seu celular
*/
public class Ex06
{
    public static void main(String[] args)
    {
        Contato contato1 = new Contato();
        contato1.nome = "João";
        contato1.endereco = "Av paulista";
        contato1.email="joao@gmail.com";
        
        contato1.telefones = new String[5];
        contato1.telefones[0] = "9999-9999";
        contato1.telefones[1] = "9999-9993";
        contato1.telefones[2] = "9999-9991";
    }
}
