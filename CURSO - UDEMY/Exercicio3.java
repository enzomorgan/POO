//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).


import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        int A, B, C, D, DIFERENCA;
        System.out.println("A:");
        A = x.nextInt();
        System.out.println("B:");
        B = x.nextInt();
        System.out.println("C:");
        C = x.nextInt();
        System.out.println("D:");
        D = x.nextInt();

        DIFERENCA = (A * B - C * D);

        System.out.println("DIFERENCA = " + DIFERENCA);

        x.close();
    }
}
