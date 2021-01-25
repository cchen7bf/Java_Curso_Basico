/*
Reescreva os exercicios, criando todos os atributos do tipo privado, métodos getters e setters e construtores. Os métodos que serão utilizados pela classe de teste devem ser públicos. Se necessário, crie métodos privados como auxiliares para organizar o código fonte.

Escreva uma classe para representar um aluno. Adicione atributos relaciodos ao aluno, como nome, matricula, curso, nome de 3 disciplinas, e as notas dessas disciplinas.

Desenvolva um programa para testar essa classe, que pede as informações do aluno e ao final informa o nome das disciplinas, mostra as notas e mostra se o aluno foi aprovado ou não.
*/

import java.util.Scanner;

public class Ex03
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();
        System.out.println("Digite o nome do Aluno: ");
        aluno.setNome(scan.nextLine());
        System.out.println("Digite o número de matrícula: ");
        aluno.setMatricula(scan.nextInt());
        System.out.println("Digite o nome do Curso:");
        aluno.setCurso(scan.next());

        for (int i=0; i<3; i++)
        {
            System.out.println("Digite o nome da matéria 0"+(i+1)+":");
            aluno.definirMaterias(i, scan.next());
            for (int j=0; j<4; j++)
            {
                System.out.println("Digite a nota " +(j+1)+ " de " +aluno.getNomeDisciplinas()[i]);
                aluno.definirNotas(i, j, scan.nextDouble());

            }
        }

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Número de matrícula: " + aluno.getMatricula());
        System.out.println("Curso: " + aluno.getCurso());
        for (int i=0; i<3; i++)
        {
            System.out.print(aluno.getNomeDisciplinas()[i] +": ");
            System.out.println(aluno.verificarAprovado(i));
        }

    }
}
