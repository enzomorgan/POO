//Para alavancar as vendas, uma loja resolveu fazer a seguinte promoção relâmpago em dois setores:
//• No setor de Eletros, que possui código 222, todas as peças que custam mais de R$ 500 vão ter 10% de desconto.
//• No setor de Cama, mesa e banho, que possui código 111, peças com valor acima de R$ 100 vão ter 40% de desconto, peças que custam entre R$ 50 e R$ 100 vão ter
//20% de desconto e peças abaixo de R$ 50 vão ter 10% de desconto.
//Escreva um programa que recebe do usuário o código do setor da loja e o valor original de um produto e imprime na tela o nome do setor e o valor do produto com desconto. Caso
//o usuário forneça um código diferente de 111 ou 222, exiba a mensagem Setor Invalido.


import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in); 

        int codigo;
        double valor, desconto;

        System.out.println("PROMOÇÃO: ");
        System.out.println("CÓDIGOS DE DESCONTO: \n");
        System.out.println("222: ELETROS");
        System.out.println("acima de R$ 500 tem 10% de desconto\n");
        System.out.println("111: CAMA, MESA E BANHO");
        System.out.println("acima de R$ 100 tem 40% de desconto");
        System.out.println("entre R$ 50 e R$ 100 tem 20% de desconto");
        System.out.println("abaixo de R$ 50 tem 10% de desconto\n");

        System.out.println("Valor do produto: ");
        valor = x.nextDouble();
        System.out.println("Informe o códdigo para desconto: ");
        codigo = x.nextInt();
        
        if(valor > 500.00 && codigo == 222){
            desconto = valor * 0.9;
            System.out.println("ELETROS - valor com desconto: R$ " + desconto);
        }
        else if(valor > 100.00 && codigo == 111){
            desconto = valor * 0.6;
            System.out.println("CAMA, MESA E BANHO - valor com desconto: R$ " + desconto);
        }
        else if(valor >= 50.00 || valor < 100.00 && codigo == 111){
            desconto = valor * 0.8;
            System.out.println("CAMA, MESA E BANHO - valor com desconto: R$ " + desconto);
        }
        else if(valor < 50.00 && codigo == 111){
            desconto = valor * 0.9;
            System.out.println("CAMA, MESA E BANHO - valor com desconto: R$ " + desconto);
        }
          else if(valor > 1.00 && codigo != 222 || codigo != 111){
            System.out.println("Setor Invalido!");
        }
    
        x.close();
    }
}
