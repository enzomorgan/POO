//Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel"


import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int N;

        System.out.println("Valor: ");
        N = x.nextInt();

        System.out.println("Informe os valores: ");
        for(int i = 0; i < N; i++){
            int num1, num2;
            num1 = x.nextInt();
            num2 = x.nextInt();
                if(num2 == 0){
                    System.out.println("divisao impossivel");
                }
                else{
                    int divisao = num1/num2;
                    System.out.println(divisao);
                }
        }

        x.close();
    }
}
