//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo

import java.util.Scanner; 

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        double TT = 3.14159, area, raio;

        System.out.println("Informe o raio: ");
        raio = x.nextDouble();

        area = TT * raio * raio;

        System.out.println("A = " + area);

        x.close();
    }
}

