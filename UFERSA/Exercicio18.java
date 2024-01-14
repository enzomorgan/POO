//Crie uma função recursiva potencia(base,expoente) que, quando chamado, retorna baseexpoente

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int base = x.nextInt();
        int expoente = x.nextInt();
       
        System.out.println(potencia(base, expoente));

        x.close();
    }

    public static int potencia(int b, int ex){
        if(ex == 0){
            return 1;          
        } 
        else{
            return b * potencia(b, ex - 1);  
        }
    }
}
