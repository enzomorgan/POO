import funcionario.Salario;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Salario salario = new Salario();

        System.out.print("Name: ");
        salario.name = sc.nextLine();
        System.out.print("Gross salary: ");
        salario.GrossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        salario.tax = sc.nextDouble();


        System.out.println("Employee: " + salario.name + " $ " + salario.NetSalary());
        System.out.println();

        System.out.println("Whitch percentage to increase salary: ");
        double percentage = sc.nextDouble();

        salario.IncreaseSalary(percentage);

        sc.close();
    }
}
