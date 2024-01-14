//Crie uma função recursiva mdc que retorna o máximo divisor comum de m e n.

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int max, min;
        max = x.nextInt();
        min = x.nextInt();

        System.out.println(mdc(max, min));

        x.close();
    }

    private static int mdc(int m, int n){
        if(n > m){
            return mdc(n, m);
        }
        else if(n == 0){
            return m;
        }
        else{
            return mdc(n, m % n);
        }
    }
}
