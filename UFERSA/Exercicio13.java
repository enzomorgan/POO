//Escreva um programa para imprimir uma versão aproximada de um cartão da Mega-Sena
//(somente com os números, respeitando o número de linhas e a distribuição dos números
//nas linhas).

import java.util.Random;

public class Exercicio13 {
    public static void main(String[] args) {

        int cartão [][] = new int[6][10];
        Random random = new Random(); 

       for(int i = 0; i < 6; i++){
            for(int j = 0; j < 10; j++){
                cartão[i][j] = random.nextInt(60) + 1;
            }
       }

        for(int i = 0; i < 6; i++){
            System.out.println("| ");
                for(int j = 0; j < 10; j++){
                    System.out.println("| " + cartão[i][j]);
                }
        }
        


    }
}
