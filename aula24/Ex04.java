/*
Usando o resultado do modeli Livro como base, crie uma classe LivroDeBiblioteca que represente os dados básicos de um livro de uma biblioteca.
*/
import java.util.Date;

public class Ex04
{
    public static void main(String[] args)
    {
        LivroDeBiblioteca livro = new LivroDeBiblioteca();

        livro.nome = "master";
        livro.autor = "Rony";
        livro.paginas = 100;
        livro.ano = 2020;

        livro.emprestado = true;
        livro.dataEntrega = new Date();
        livro.emprestadoA = "Rony";

        System.out.println("Nome do livro = " +livro.nome);
    }
}
