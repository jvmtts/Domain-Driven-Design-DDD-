public class TesteAluno {
    public static void main(String[] args) {
 
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Claudia";
        aluno1.curso = "Engenharia de Software";
        aluno1.idade = 19;
 
        Aluno aluno2 = new Aluno("Claudio", 18, "Ciência da Computação");
 
        aluno1.apresentar();
        aluno2.apresentar();
    }
}