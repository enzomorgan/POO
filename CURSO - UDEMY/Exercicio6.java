//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C



import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        double A, B, tri, trapez, quad, retan, C, cir, pi = 3.14;
        System.out.println("A:");
        A = x.nextDouble();
        System.out.println("B:");
        B = x.nextDouble();
        System.out.println("C:");
        C = x.nextDouble();

        tri = (A * B)/2;
        cir = pi * C * C;
        trapez = (A * B)/ 2 * C;
        quad = B * B;
        retan = A * B;

        System.out.println("TRINAGULO: " + tri);
        System.out.println("CIRCULO: " + cir);   
        System.out.println("TRAPEZIO: " + trapez);
        System.out.println("QUADRADO: " + quad);
        System.out.println("RETANGULO: " + retan);


        x.close();
    }    
}