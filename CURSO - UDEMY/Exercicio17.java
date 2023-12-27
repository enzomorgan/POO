//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
//4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//que seja válido). O programa será encerrado quando o código informado for o número 4

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int combustivel, alcool = 0, gasolina = 0, diesel = 0;

        System.out.println("COMBUSTIVEIS: ");
        System.out.println("1 - ALCOOL");
        System.out.println("2 - GASOLINA");
        System.out.println("2 - DIESEL");
        System.out.println("4 - FIM");

        System.out.println("Informe o combustivel que deseja colocar: ");
        combustivel = x.nextInt();

        while (combustivel != 4) {
            System.out.println("Informe o combustivel que deseja colocar: ");
            combustivel = x.nextInt();

                if(combustivel == 1){
                    alcool = alcool + 1;
                }

                else if(combustivel == 2){
                    gasolina = gasolina + 1;
                }

                else if(combustivel == 3){
                    diesel = diesel + 1;
                }

                else if(combustivel == 4){
                    break;    
                }

                System.out.println("MUITO OBRIGADO!");
                System.out.println("Alcool: " + alcool);
                System.out.println("Gasolina: " + gasolina);
                System.out.println("Diesel: " + diesel);
                
        }


        x.close();
    }
}