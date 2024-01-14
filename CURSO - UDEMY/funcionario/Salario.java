package funcionario;

public class Salario {
    public String name;
    public double GrossSalary;
    public double tax;

    public double NetSalary(){
        return GrossSalary - tax;
    }

    public void IncreaseSalary(double percentage){
        percentage = (GrossSalary - tax) * 1.10;
        System.out.println(percentage); 
    }
}
