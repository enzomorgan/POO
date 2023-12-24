//Escreva um programa que lê três números e determina qual número é o menor

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int num1, num2, num3, menor = 0;
        System.out.println("Informe o primeiro número: ");
        num1 = x.nextInt();
        System.out.println("Informe o segundo número: ");
        num2 = x.nextInt();
        System.out.println("Informe o terceiro número: ");
        num3 = x.nextInt();

        if (num1 < num2 && num1 < num3) {
            menor = num1;
            System.out.println("Menor valor : " + menor);
        }
        if (num2 < num1 && num2 < num3) {
            menor = num2;
            System.out.println("Menor valor : " + menor);
        }
        if (num3 < num1 && num3 < num2) {
            menor = num3;
            System.out.println("Menor valor : " + menor);
        }

        x.close();
    }
}
