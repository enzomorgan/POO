//Escreva uma classe para representar um time de um esporte qualquer em um campeonato desse esporte. Que atributos devem ser representados nessa classe? Quais métodos
//ela deve conter? Escreva um aplicativo de teste que demonstre as capacidades da
//classe criada.

import esporte.Time;

import java.util.Scanner;

public class Exercicio23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Time time = new Time();

        System.out.print("Nome do time: ");
        time.nome = sc.nextLine();
        System.out.print("Numero de jogadores inscritos: ");
        time.num_joga = sc.nextInt();
        System.out.print("Esporte: ");
        time.esporte = sc.nextLine();
        
        System.out.println();
        System.out.println("TIME: " + time);

        int jogador;
        System.out.println("Quantos jogadores deseja remover: ");
        jogador = sc.nextInt();
        time.remove_jog(jogador);
        
        System.out.println();
        System.out.println("lista de jogadores atualizada: " + time);

        System.out.println();
        System.out.println("Quantos jogadores deseja adicionar: ");
        jogador = sc.nextInt();
        time.add_jog(jogador);

        System.out.println();
        System.out.println("lista de jogadores atualizada: " + time);

        sc.close();
    }
}