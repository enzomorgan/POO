//Escreva um programa que recebe um valor inteiro representando um intervalo em minutos
//e imprime o equivalente a esse período expresso em valores inteiros para dias, horas e
//minutos. Ex.: 9257 minutos = 6 dias, 10 horas e 17 minutos.

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);

        int num, dias, horas, minutos;

        num = x.nextInt();

        dias = (num/60)/24;
        horas = (num % 1440)/60;
        minutos = num%60;


        System.out.println(num + "minutos = " + dias + " dias, " + horas + " horas, " + minutos + "minutos");

        x.close();
    }
}
