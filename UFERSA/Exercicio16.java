//Escreva um programa que determine quais são todos os números de 3 algarismos cuja
//soma dos cubos de seus algarismos sejam iguais ao próprio número.


import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        int num;
        num = x.nextInt();

       if(num < 100 || num > 999){
             System.out.println("fora dos limites!");
       }

       for(int i = 100; i < num; i++){
            if(somaCubos(i) == i){
                System.out.println(i);
            }
       }
       
        x.close();
    }

    public static int somaCubos(int numero){
        int soma = 0; int temp = numero;

        while (temp > 0) {
            int digito = temp % 10;
            soma += Math.pow(digito, 3);
            temp /= 10;
        }

        return soma;
    }
}
