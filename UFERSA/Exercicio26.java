//Crie uma classe denominada Elevador para armazenar as informações de um elevador
//dentro de um prédio. A classe deve armazenar o número do andar atual, o total de
//andares no prédio, a capacidade do elevador e quantas pessoas estão presentes nele.

import predio.Elevador;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Elevador elevador = new Elevador();

        System.out.print("Numero de andar atual: ");
        elevador.num_andar = sc.nextInt();
        System.out.print("Pessoas presentes: ");
        elevador.pessoas_pres = sc.nextInt();

        System.out.println();
        int pessoas_pres = sc.nextInt();
        elevador.sai(pessoas_pres);

        System.out.println("Pessoas presentes: " + elevador.pessoas_pres);
        sc.close();
    }    
}
