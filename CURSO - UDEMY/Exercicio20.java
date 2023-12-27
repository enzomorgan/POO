//Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
//de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
//conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
//peso 5.


import java.util.Scanner;


public class Exercicio20 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);

        int N;
        double media;

        System.out.println("Valor: ");
        N = x.nextInt();

        System.out.println("Testes: ");
        for(int i = 0; i < N; i++){
           
            double teste1 = y.nextDouble();
            double teste2 = y.nextDouble();
            double teste3 = y.nextDouble();


            media = (teste1 * 2.0 + teste2 * 3.0 + teste3 * 5.0) / 10.0;

            System.out.printf("%.1f%n", media);
        }


        x.close();
        y.close();
    }
}
