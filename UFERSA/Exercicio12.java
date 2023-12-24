//O mês de fevereiro de 2015 começou em um domingo. Escreva um programa que, dado
//o número de um dia do mês de fevereiro de 2015 (um valor entre 1 e 28), imprime o dia
//da semana correspondente.


import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        
        int diaMes, mes, ano;

        System.out.println("Informe a data: ");
        diaMes = x.nextInt();
        mes = x.nextInt();
        ano = x.nextInt();


       if(mes < 3){
            mes += 12;
            ano--;
       }

       int d = diaMes;
       int m = mes;
       int a = ano % 100; 
       int b = ano / 100;

       int diasSemana = (d + 13 * (m + 1) / 5 + a + a / 4 + b / 4 - 2 * b) % 7;

       String[] nomesDias = {"Sábado", "Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira",
       "Quinta-feira", "Sexta-feira"};

       String nomeDia = nomesDias[diasSemana];

       System.out.println("O dia " + diaMes + " sera " + nomeDia);


        x.close();
    }
}
