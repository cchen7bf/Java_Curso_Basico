/*
Faça um programa que calcule as raízes de uma equação. o programa deverá pedir os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:
    a. Se o usuário informar o valor de A igual a 0, o programa deve ser encerrado.
    b. Se o delta calculado for negativo. A equação não possui resultados reais, e o programa deve ser encerrado.
    c. Se o delta for igual a zero, a equação possui apenas uma raiz, informe ao usuário.
    d. Se o delta for positivo, informe as raízes ao usuário.
*/

import java.util.Scanner;

public class Ex16
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de 'a': ");
        double a = scan.nextDouble();

        if (a==0)
            System.out.println("O sistema não é de 2o grau.");
        else
        {
            System.out.println("Digite o valor de 'b': ");
            double b = scan.nextDouble();

            System.out.println("Digite o valor de 'c': ");
            double c = scan.nextDouble();

            double delta = (b*b)-(4*a*c);

     /*       double x=0;
            double x1=0;
            double x2=0;
    */
            if (delta<0)
                System.out.println("A equação não pussiu resultados reais");
            else if (delta ==0)
            {
                double x=-b/(2*a);
                System.out.println("O resultado é x= "+x);
            }
            else
            {
                double x1=((-b)+Math.sqrt(delta))/(2*a);
                double x2=((-b)-Math.sqrt(delta))/(2*a);
                System.out.println("O resultado é x'= "+x1);
                System.out.println("O resultado é x''= "+x2);
            }    
        }
    
    } 
}
