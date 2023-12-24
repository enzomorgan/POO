//Escreva um programa que calcule a soma e a média aritmética de 3 números. Os 3
//valores reais serão informados pelo usuário.

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        Scanner y = new Scanner(System.in);
        float n1, n2, n3, media_aritmetica;
        System.out.println("Informe as notas: ");
        n1 = y.nextFloat();
        n2 = y.nextFloat();
        n3 = y.nextFloat();

        media_aritmetica = (n1 + n2 + n3)/3;

        System.out.println(media_aritmetica);

        y.close();
    }    
}



