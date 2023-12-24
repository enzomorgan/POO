//Escreva um programa que lê um número que representa o valor da carta, de um (ás) a
//treze (rei), e outro número correspondente ao naipe (1 = ouros, 2 = paus, 3 = copas e 4 =
//espadas). O programa deve imprimir o nome da carta por extenso.

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int naipe, valorCarta;

        System.out.print("Digite o valor da carta (de 1 a 13): ");
        valorCarta = x.nextInt();
        System.out.print("Digite o naipe da carta (1 = ouros, 2 = paus, 3 = copas, 4 = espadas): ");
        naipe = x.nextInt();

        if (valorCarta < 1 || valorCarta > 13 || naipe < 1 || naipe > 4) {
            System.out.println("Valores inválidos.");
        } else {
            String nome_carta = NomeCarta(valorCarta);
            String nome_Naipe = NomeNaipe(naipe);

            System.out.println("A carta é: " + nome_carta + " de " + nome_Naipe);
        }

        x.close();
    }

    public static String NomeCarta(int valor) {
        switch(valor){
            case 1:
                return "Ás";
            case 11:
                return "Valete";
            case 12:
                return "Dama";
            case 13:
                return "Rei";
            default:
                return String.valueOf(valor);
        }
    }


    public static String NomeNaipe(int naipe) {
        switch(naipe) {
            case 1:
                return "Ouros";
            case 2:
                return "Paus";
            case 3:
                return "Copas";
            case 4:
                return "Espadas";
            default:
                return "Naipe inexistente!";
        }
    }

}

