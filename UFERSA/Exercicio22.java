//Escreva uma função recursiva para calcular Pn(x). Os parâmetros n, a0, · · · , an e o valor
//x devem ser solicitados ao usuário na função main.

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o grau do polinômio (n): ");
        int n = scanner.nextInt();

        double[] coeficientes = new double[n + 1];

        System.out.println("Digite os coeficientes do polinômio (do a0 ao an):");
        for (int i = 0; i <= n; i++) {
            System.out.print("a" + i + ": ");
            coeficientes[i] = scanner.nextDouble();
        }

        System.out.print("Digite o valor de x: ");
        double x = scanner.nextDouble();

        double resultado = calcularPolinomio(coeficientes, n, x);

        System.out.println("O valor de Pn(" + x + ") é: " + resultado);

        scanner.close();
    }

    public static double calcularPolinomio(double[] coeficientes, int n, double x) {
        if (n == 0) {
            return coeficientes[0];
        } else {
            return x * calcularPolinomio(coeficientes, n - 1, x) + coeficientes[n];
        }
    }
}