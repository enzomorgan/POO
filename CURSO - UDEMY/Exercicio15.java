//Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
         
        int senha = 2002;
        int senha_digitada;

        System.out.println("Informe uma senha: ");
        senha_digitada = x.nextInt();

        while (senha_digitada != senha) {
            System.out.println("Senha Invalida!");
            System.out.println("Informe uma senha: ");
            senha_digitada = x.nextInt();
                if (senha_digitada == senha){
                    System.out.println("Acesso permitido");
                }
        }



        x.close();
    }
    
}
