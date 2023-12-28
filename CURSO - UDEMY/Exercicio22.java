//Ler um valor N. Calcular e escrever seu respectivo fatorial

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int N;
        int fat = 1;

        N = x.nextInt();

        for(int i = 1; i <= N;i++){
            fat = fat * i;
        }

        System.out.println(fat);

        x.close();
    }
}
