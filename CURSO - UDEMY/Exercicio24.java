//Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
//começando de 1 até N

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int N, L1, L2, L3;

        N = x.nextInt();

        for(int i = 1; i <= N; i++){
            L1 = i;
            L2 = i * i;
            L3 = i * i * i;
            System.out.printf("%d %d %d\n", L1, L2, L3);
        }






        x.close();
    }
}
