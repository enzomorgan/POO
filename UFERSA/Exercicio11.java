//Escreva um programa que lê dois pontos no plano cartesiano com coordenadas x e y e
//informa se o segundo ponto está acima, abaixo, à esquerda e/ou à direita do primeiro.


import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args){
        Scanner pontos = new Scanner(System.in);
        float x1,y1, x2, y2;

        System.out.println("Informe as primeiras coodernadas: ");
        x1 = pontos.nextFloat();
        y1 = pontos.nextFloat();
        
        System.out.println("Informe as segundas coordenadas: ");
        x2 = pontos.nextFloat();
        y2 = pontos.nextFloat();

        if(x2 > x1){
            System.out.println("o segundo ponto está à direita do primeiro ponto!");
        }
        else if(x2 < x1){
            System.out.println("o segundo ponto está à esquerda do primeiro ponto!");
        }
        else{
            System.out.println("o segundo ponto está na mesma posição do primeiro ponto!");
        }

        if(y2 > y1){
            System.out.println("o segundo ponto está acima do primeiro ponto!");
        }
        else if(y2 < y1){
            System.out.println("o segundo ponto está abaixo do primeiro ponto!");
        }

        pontos.close();
    }
}
