/*
Faça um programa que leia e valde as seguintes informaçẽs:
    - nome: maior que 3 caracteres;
    - Idade: entre 0 e 150;
    - Salário: maior que zero;
    - sexo: f ou m;
    - estado civil: s, c, v, d.
*/

import java.util.Scanner;

public class Ex03
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        boolean valido=false;
        String nome;
        int idade;
        double salario;
        String sexo;
        String civil;

        do
        {
            System.out.println("Digite o nome: ");
            nome = scan.next();
            if (nome.length()>=3)
                valido = true;
            else
                System.out.println("Digite um nome com mais que 3 caracteres.");
        } while(!valido);

        valido = false;

        do
        {
            System.out.println("Digite a idade: ");
            idade = scan.nextInt();
            if (idade>0 && idade<150)
                valido = true;
            else
                System.out.println("Digite uma idade entre 0 e 150 anos.");
        } while(!valido);

        valido = false;

        do
        {
            System.out.println("Digite o salário: ");
            salario = scan.nextDouble();
            if (salario>0)
                valido = true;
            else
                System.out.println("Digite um salário maior que 0.");
        } while(!valido);

        valido = false;

        do
        {
            System.out.println("Digite seu sexo(m/f): ");
            sexo = scan.next();
            if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f"))
                valido = true;
            else
                System.out.println("Digite um sexo válido.");
        } while(!valido);
       valido = false;

        do
        {
            System.out.println("Digite seu estado civil (s, c, v, d): ");
            civil = scan.next();
            if (civil.equalsIgnoreCase("s") || civil.equalsIgnoreCase("c") || civil.equalsIgnoreCase("v") || civil.equalsIgnoreCase("d"))
                valido = true;
            else
                System.out.println("Digite um estado civil válido.");
        } while(!valido);
    }
}
