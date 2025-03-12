public class RegistroAcademico{
    private static int numeroDeMatriculas = 0;
    private String nome;
    private String curso;
    private int matricula;

    public RegistroAcademico(String nome, String curso) {
        this.nome = nome;
        this.curso = curso;
        numeroDeMatriculas++;
        this.matricula = numeroDeMatriculas;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome + ", Curso: " + curso + ", Matrícula: " + matricula);
    }
}