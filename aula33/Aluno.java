public class Aluno
{
    private String nome;
    private int matricula;
    private String curso;
    private String [] nomeDisciplinas;
    private double [][] notasDisciplinas;

    public Aluno()
    {
        nomeDisciplinas = new String [3];
        notasDisciplinas = new double[3][4];
    }


 /*   public Aluno(String nome, int matricula)
    {
        this.nome = nome;
        this.matricula = matricula;
    }
*/
    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int getMatricula()
    {
        return matricula;
    }

    public void setMatricula(int matricula)
    {
        this.matricula = matricula;
    }

    public String getCurso()
    {
        return curso;
    }

    public void setCurso(String curso)
    {
        this.curso = curso;
    }

    public String [] getNomeDisciplinas()
    {
        return nomeDisciplinas;
    }

    public void setNomeDisciplinas(String [] nomeDisciplinas)
    {
        this.nomeDisciplinas = nomeDisciplinas;
    }

    public double [][] getNotasDisciplinas()
    {
        return notasDisciplinas;
    }

    public void setNotasDisciplinas(double[][] notasDisciplinas)
    {
        this.notasDisciplinas = notasDisciplinas;
    }

    public void definirMaterias(int i, String nome)
    {
        this.nomeDisciplinas[i] = nome;
    }

    public void definirNotas(int i, int j, double nota)
    {
        this.notasDisciplinas[i][j] = nota;
    }

    public double calcularMedia (int materia)
    {
        double soma = 0;

        for (int i=0; i<4; i++)
        {
            soma += notasDisciplinas[materia][i];
        }
        return (soma/4);
    }

    public String verificarAprovado(int materia)
    {
        if (calcularMedia(materia) >=7)
            return "Aprovado";
        else
            return "Reprovado";
    }

}
