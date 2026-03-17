public class Aluno {
    protected String nome;
    protected int idade;
    protected String curso;
 
    public void apresentar() {
        System.out.println("Nome: " + this.nome + " - " + this.idade + " anos");
        System.out.println("Atualmente cursando: " + this.curso);
    }
 
    public Aluno() {
 
    }
 
    public Aluno(String nome, int idade, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }
}