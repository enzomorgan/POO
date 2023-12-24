//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa


import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n1, n2, soma = 0;
        System.out.println("Informe os número: ");
        n1 = x.nextInt();
        n2 = x.nextInt();

        soma = n1 + n2;

        System.out.println("Soma = " + soma);

        x.close();
    }
}
