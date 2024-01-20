//Escreva uma classe que contenha métodos estáticos para retornar o maior de dois, três,
//quatro e cinco valores, considerando que os argumentos e o retorno dos métodos podem
//ser dos tipos int e double



import metodos.Estaticos;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Maior de 2 inteiros: " + Estaticos.maior_Dois(10, 12));
        System.out.println("Maior de 2 pontos flutuantes: " + Estaticos.maiores_dois(10.12, 12.23));

        System.out.println("Maior de 3 inteiros: " + Estaticos.maior_tres(10, 12, 90));
        System.out.println("Maior de 3 pontos flutuantes: " + Estaticos.maiores_tres(10.12, 12.23, 90.12));
       
        System.out.println("Maior de 4 inteiros: " + Estaticos.maior_quatro(10, 12, 90, 45));
        System.out.println("Maior de 4 pontos flutuantes: " + Estaticos.maiores_quatro(10.12, 12.23, 90.12, 45.74));
       
        System.out.println("Maior de 5 inteiros: " + Estaticos.maior_cinco(10, 12, 90, 45, 85));
        System.out.println("Maior de 5 pontos flutuantes: " + Estaticos.maiores_cinco(10.12, 12.23, 90.12, 45.74, 85.96));

        sc.close();
    }
}
