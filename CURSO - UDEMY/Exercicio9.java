//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//Multiplos", indicando se os valores lidos são múltiplos entre si

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        int A, B;

        A = x.nextInt();
        B = x.nextInt();

        if(A % B == 0 || B % A == 0){
            System.out.println("Sao multiplos");
        }
        else{
            System.out.println("Nao sao multiplos");
        }

        x.close();
    }
}
