//Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina da
//Ufersa. Cada objeto dessa classe deve guardar os seguintes dados do aluno: matrícula,
//nome, 2 notas de prova (P1 e P2) e 1 nota de trabalho (T).

import faculdade.Notas;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Notas notas = new Notas();

        notas.aluno(123, "enzo", 7.0, 6.5, 8.0);
        
        System.out.println("Media: " + notas.media());
        
        double PF = notas.provaFInal();
            if(PF > 0){
                System.out.println("Precisa de: " + PF + " na prova final");
            }
            else{
                System.out.println("Nao precisa fazer prova final");
            }

            System.out.println("Aprovado? " + notas.verificaAP());
        
        sc.close();
    }
}