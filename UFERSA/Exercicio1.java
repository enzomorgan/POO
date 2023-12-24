//Escreva um programa que calcule a área de um quadrado. O valor do lado de um qua-
//drado deverá ser informado pelo usuário.

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
            float base, altura, area;
            System.out.println("Informe a base: ");
            base = x.nextFloat();
            System.out.println("Informe a altura: ");
            altura = x.nextFloat();

            area = (base * altura) / 2;

            System.out.println(area);

            x.close();
        }
    }
