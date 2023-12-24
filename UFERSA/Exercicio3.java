//Escreva um programa que receba um ângulo em graus e o converta para sua representação
//em radianos. Divulgue também seno, cosseno, tangente, cossecante, secante e
//cotangente do ângulo.

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);

        int angulo;
        double radianos = 0;
        double seno = 0, cosseno = 0, tangente = 0, cossecante = 0, secante = 0, cotangente = 0;

        System.out.println("Angulo: ");
        angulo = x.nextInt();

        radianos = angulo * (3.14159/180);

        seno = Math.sin(radianos);
        cosseno = Math.cos(radianos);
        tangente = Math.tan(radianos);
        cossecante = Math.cosh(radianos);
        secante = Math.sin(radianos);
        cotangente = Math.tan(radianos);

        System.out.println("Graus: " + radianos);
        System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + cosseno);
        System.out.println("Tangente: " + tangente);
        System.out.println("Cossecante: " + cossecante);
        System.out.println("Secante: " + secante);
        System.out.println("Cotangente: " + cotangente);


        x.close();
    }    
}
