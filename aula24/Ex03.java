/*
Usando o resultado do exercicio anterior, crie uma classe LivroLivraria que represente os dados básicos de u livro que está a venda em uma livraria.
*/

public class Ex03
{
    public static void main(String[] args)
    {
        LivroLivraria livro = new LivroLivraria();

        livro.nome = "master";
        livro.autor = "Rony";
        livro.paginas = 100;
        livro.ano = 2020;
        livro.preco = 63.39;

        System.out.println("Nome do livro = " +livro.nome);
    }
}
