//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        int num, horas;
        float valor, salario;
        System.out.println("Informe o número: ");
        num = x.nextInt();
        System.out.println("Horas trabalhadas: ");
        horas = x.nextInt();
        System.out.println("Informe o valor que recebe: ");
        valor = y.nextFloat();

        salario = horas * valor;

        System.out.println("NUMBER: " + num);
        System.out.println("SALARY: U$" + salario);

        x.close();
        y.close();
        
      }
}

