/*
Faça um programa que leia um npme de usuário e a sua senha e não aceite a senha igual ao nome do usuário, monstrando uma mensagem de erro e voltando a pedir as informações.
*/

import java.util.Scanner;

public class Ex02
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        boolean valido = false;

        do
        {
            System.out.println("Digite o usuário: ");
            String usuario = scan.next();

            System.out.println("Digite a senha: ");
            String senha = scan.next();

            if (usuario.equalsIgnoreCase(senha))
                System.out.println("A senha não pode ser a mesma que o usuário");
            else
            {
                System.out.println("A senha válida");
                valido = true;
            }
        } while (!valido);
    }
}
