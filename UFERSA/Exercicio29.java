//Escreva uma classe para representar um número complexo. Essa classe deve conter três construtores. Um construtor deverá receber os dois valores (parte real e parte imaginária)
//como argumentos, o outro somente o valor real, considerando o imaginário como sendo zero, e o terceiro construtor não recebe argumentos, considerando as partes real e
//imaginária do número complexo como sendo iguais a zero

import complexo.Numeros;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Numeros numero = new Numeros();

        double real, imaginaria;

        numero.real = sc.nextDouble();
        numero.imaginaria = sc.nextDouble();

        System.out.println("Numero complexos: " + numero.toString());
        
        
        sc.close();
    }
}