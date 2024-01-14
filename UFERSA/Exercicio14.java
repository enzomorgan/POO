//Escreva um programa que apresente a série de Fibonacci até o n-ézimo termo. Assuma
//que n > 0.

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int n = x.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, insira um valor válido para n (n > 0).");
        } else {
            System.out.println("Série de Fibonacci até o " + n + "-ésimo termo:");
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci(i) + " ");
            }

        x.close();
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
