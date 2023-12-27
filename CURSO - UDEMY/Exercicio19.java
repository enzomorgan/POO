//Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.


import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);

        int n, in = 0, out = 0;

        System.out.println("Valor: ");
        n = z.nextInt();


        System.out.println("Valores de X: ");
        for(int i = 0; i < n; i++){
            int x;
            x = z.nextInt();
                if(x >= 10 && x <= 20){
                    in = in + 1;
                }
                else{
                    out = out + 1;
                }
        }

        System.out.println(in + " in ");
        System.out.println(out + " out ");

        z.close();
    }
}
