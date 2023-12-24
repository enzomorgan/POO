//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.0

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        int num;
        System.out.println("Digite um número: ");
        num = x.nextInt();

        if(num >= 0){
            System.out.println("NAO NEGATIVO");
        }
        else{
            System.out.println("NEGATIVO");
        }

        x.close();
    }
}
