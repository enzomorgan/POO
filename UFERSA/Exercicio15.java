//Escreva um programa que escreve os 4 primeiros números perfeitos. Um número perfeito
//é aquele que é igual à soma dos seus divisores (exceto o próprio número).


import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int N;
        int num_per = 0;
        N = x.nextInt();

        while (num_per < 4) {
            int soma = 0;
                for(int i = 1; i <= N / 2; i++){
                  if(N % i == 0){
                    soma += i;
                }
            }
            
            if(soma == N){
                System.out.println(N);
                num_per++;
            }

            N++;
        }

        
        x.close();
    }
}