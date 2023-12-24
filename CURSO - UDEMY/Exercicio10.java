//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

import java.util.Scanner;


public class Exercicio10 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        int in, fim, duracao;

        System.out.println("Horário do inicio: ");
        in = x.nextInt();
        System.out.println("Horário do término: ");
        fim = x.nextInt();

        if(in < fim){
            duracao = fim - in;
            System.out.println("O jogo durou" + duracao);
        }
        else{
            duracao = 24 - in + fim;
            System.out.println("O jogo durou" + duracao);
        }

        


        x.close();
    }
}
