//Crie uma função recursiva que verifique se um dado número é primo.

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int primo;
        primo = x.nextInt(); 

        if(primo <= 0){
            System.out.println("Informe um valor positivo");
        }

        if(num_primo(primo, primo / 2)){
            System.out.println(primo + " numero primo");
        }
        else{
            System.out.println(primo + " nao e primo");
        }

        x.close();
    }

    private static boolean num_primo(int num, int divisor){
        if(divisor == 1){
            return true;
        }
        else{
            if(num % divisor == 0){
                return false;
            }
            else{
                return num_primo(num, divisor - 1);
            }
        }
    }
}
