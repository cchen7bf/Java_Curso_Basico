/*
Crie um classe Livro que represente os dados básicos de um livro, sem se preocupar com a sua finalidade.
*/
public class Ex02
{
    public static void main(String[] args)
    {
        Livro livro = new Livro();

        livro.nome = "master";
        livro.autor = "Rony";
        livro.paginas = 100;
        livro.ano = 2020;

        System.out.println("Nome do livro = " +livro.nome);
    }
}
