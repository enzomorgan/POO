public class Tecnico extends Assistente {
    private String curso;

    public Tecnico(String nome, double salario, String matricula, String curso) {
        super(nome, salario, matricula);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void bonusSalario(double bonus) {
        super.setSalario(super.getSalario() + bonus);
    }

    public void ganhoAnual() {
        System.out.println("Ganho anual: " + (super.getSalario() * 12 + super.getSalario()));
    }

    @Override
    public String toString() {
        return super.toString() + ", Curso: " + curso;
    }
}
