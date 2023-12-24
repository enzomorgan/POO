//Escreva um programa que receba uma temperatura em graus centígrados e a apresente
//em graus Fahrenheit

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);

        float graus, Fahrenheit;

        System.out.println("Informe os graus: ");
        graus = x.nextFloat();
        
        Fahrenheit = (graus * 9/5) + 32;

        System.out.println("Graus em Fahrenheit: " + Fahrenheit);

        x.close();
    }
}
