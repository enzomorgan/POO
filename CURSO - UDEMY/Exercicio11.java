//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//seguir, calcule e mostre o valor da conta a pagar


import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);

        System.out.println("MENU:");
        System.out.println("CODIGO     ESPECIFICAÇÃO        PREÇO");
        System.out.println("1     Cachorro Quente      R$4.00");
        System.out.println("2     X-Salada             R$4.50");
        System.out.println("3     X-Bacon              R$5.00");
        System.out.println("4     Torrada simples      R$2.00");
        System.out.println("5     Refrigerante         R$5.00");

        int item1;
        double total, quantidade;

        System.out.println("Item escolhido: ");
        item1 = x.nextInt();
        System.out.println("Quantidade: ");
        quantidade = x.nextInt();

        switch (item1) {
            case 1:
                total = 4.00 * quantidade;
                System.out.println("Total: R$" + total);
                break;
            case 2:
                total = 4.50 * quantidade;
                System.out.println("Total: R$" + total); 
                break;
            case 3:
            case 5:
                total = 5.00 * quantidade;
                System.out.println("Total: R$" + total); 
                break;
            case 4:
                total = 2.00 * quantidade;
                System.out.println("Total: R$" + total); 
                break;
            default:
                break;
        }


        x.close();
    }
}
