//Ler um número inteiro N e calcular todos os seus divisores

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int N;

        N = x.nextInt();

        for(int i = 1; i <= N; i++){
            if(N % i == 0){
                System.out.println(i);
            }
        }



        x.close();
  }  
}
