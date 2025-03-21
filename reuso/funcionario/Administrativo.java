public class Administrativo extends Assistente {
    private String turno;

    public Administrativo(String nome, double salario, String matricula, String turno) {
        super(nome, salario, matricula);
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void ganhoAnual() {
        System.out.println("Ganho anual: " + (super.getSalario() * 12 + super.getSalario()));
    }

    public void bonusSalario(double bonus) {
        super.setSalario(super.getSalario() + bonus);
    }

    @Override
    public String toString() {
        return super.toString() + ", Turno: " + turno;
    }
}
