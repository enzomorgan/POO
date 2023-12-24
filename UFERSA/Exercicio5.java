//Escreva um programa que receba um número de 3 dígitos no formato CDU (Centena,
//Dezena e Unidade) e, utilizando operadores aritméticos, armazene cada dígito em uma
//variável de tipo inteiro. Por fim, reescreva o número no formato UCD. Exemplo: 123 deve
//ser reescrito como 312.


import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        
        int numeroCDU, Centena, Dezena, Unidade;

        numeroCDU = x.nextInt();

        Centena = numeroCDU/100;
        Dezena = (numeroCDU%100)/10;
        Unidade = numeroCDU%10;

        numeroCDU = Unidade * 100 + Centena * 10 + Dezena;

        System.out.println("UDC: " + numeroCDU);
        

        x.close();
    }
}
