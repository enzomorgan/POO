//Escreva a classe Contador que encapsule um valor usado para contagem de eventos

import eventos.Contador;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Contador contador = new Contador();

        contador.imprimirValor();

        contador.incrementar();
        contador.imprimirValor();

        contador.incrementar();
        contador.imprimirValor();

        contador.zerar();
        contador.imprimirValor();

        sc.close();
    }
}
