public class Funcionario{
    private String nome;
    private double salarioPorHora;

    private Funcionario(String nome){
        this.nome = nome;
    }

    public Funcionario(String nome, double salarioPorHora){
        this(nome);
        this.salarioPorHora = 2.0;
    }

    public String getNome(){
        return nome;
    }

    public double getSalarioPorHora(){
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora){
        this.salarioPorHora = salarioPorHora;
    }

    public double calcularSalario(int horas){
        return salarioPorHora * horas;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + " Salario por hora: " + salarioPorHora;
    }
}