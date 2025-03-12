public class DemoRegistroAcademico {
    public static void main(String[] args) {
        RegistroAcademico aluno1 = new RegistroAcademico("Joao", "Engenharia");
        RegistroAcademico aluno2 = new RegistroAcademico("Maria", "Medicina");
        RegistroAcademico aluno3 = new RegistroAcademico("Jose", "Direito");

        aluno1.exibirDados();
        aluno2.exibirDados();
        aluno3.exibirDados();
    }
}
