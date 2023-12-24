//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        int cod, cod2, num_pecas, num_pecas2;
        float valor1, valor2, total;
        System.out.println("Código da peça: ");
        cod = x.nextInt();
        System.out.println("Número de peças: ");
        num_pecas = x.nextInt();
        System.out.println("Valor da peça: ");
        valor1 = y.nextFloat();
        System.out.println("Código da peça: ");
        cod2 = x.nextInt();
        System.out.println("Número de peças: ");
        num_pecas2 = x.nextInt();
        System.out.println("Valor da peça: ");
        valor2 = y.nextFloat();

        if (num_pecas2 >= 2) {
            total = (valor2 * 2) + valor1;
            System.out.println("VALOR A PAGAR: R$" + total);
        }

        if (num_pecas >= 2 && num_pecas2 >= 4) {
            total = (valor1 * 2) + (valor2 * 4);
            System.out.println("VALOR A PAGAR: R$" + total);
        }

        if (num_pecas == 1 && num_pecas2 == 1) {
            total = valor1 + valor2;
            System.out.println("VALOR A PAGAR: R$" + total);
        }

        x.close();
        y.close();
    }
}
