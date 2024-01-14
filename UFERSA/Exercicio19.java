//Escreva uma função que calcule o fatorial de forma recursiva. Para cada chamada recursiva,
//exiba as saídas em uma linha separada e adicione um nível de recuo (tabulação).

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int n;
        n = x.nextInt();

        System.out.println(n + "!" + " = " + calcularFatorial(n));

        x.close();
    }

    public static int calcularFatorial(int num) {
        return fatorial(num, 0);
    }
    
    private static int fatorial(int num, int nivel){
        if(num == 0 || num == 1){
            return 1;
        }
        else{
            imprime_recursao(nivel);
            int resultado =  num * fatorial(num - 1, nivel + 1);
            return resultado;
        }
    }

    private static void imprime_recursao(int nivel){
        for(int i = 0; i < nivel; i++){
            System.out.println(i + "\t");
        }
    }
}    