//Escreva uma classe Lampada que possui o atributo estadoDaLampada (ligado ou desligado)
//e os métodos acende, apaga e mostraEstado (ex.: A lampada esta acesa). Inclua
//um método estaLigada que retorne verdadeiro se a lâmpada estiver ligada e falso caso
//contrário. Adicione um campo que indique quantas vezes a lâmpada foi acesa.


import energia.Lampada;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Lampada lampada = new Lampada();
        
        lampada.acende();
        lampada.mostraEstado();

        lampada.apaga();
        lampada.mostraEstado();

        System.out.println("quantas vezes foi acessa? " + lampada.vezesAcessa());

        sc.close();
    }
}
