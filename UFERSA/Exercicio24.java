//Crie uma classe chamada Fatura para que uma loja de suprimentos de informática a utilize para representar uma fatura de um item vendido. Uma Fatura deve incluir as seguintes
//informações sobre o item vendido: o número de identificação, a descrição, a quantidade comprada e o preço unitário. Se a quantidade não for positiva, ela deve ser
//configurada como 0. Se o preço por item não for positivo, ele deve ser configurado como 0.0. Forneça também um método chamado calculaT otal que calcula e retorna o valor de
//fatura (isto é, multiplica a quantidade pelo preço por item). Escreva um aplicativo de teste que demonstre as capacidades da classe criada.


import cartao.Fatura;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Fatura fatura = new Fatura();
         
        System.out.print("Numero: ");
        fatura.num_ind = sc.nextInt();
        System.out.println("Descricao: ");
        fatura.descricao = sc.nextLine();
        System.out.print("Quantidade: ");
        fatura.quantidade = sc.nextInt();
        System.out.print("Preco: ");
        fatura.preco_uni = sc.nextDouble();

        System.out.println("Produto: " + fatura);

        System.out.println();
        System.out.println("Adicione quantidade: ");

        int quantidade = sc.nextInt();  
        fatura.quantity(quantidade);

        System.out.println();
        System.out.println("Atualizado: " + fatura);

        System.out.println();
        System.out.println("Quantos deseja remover: ");
        quantidade = sc.nextInt();
        fatura.removeProducts(quantidade);

        System.out.println();
        System.out.println("Qual o valor final: ");
        double preco_uni = sc.nextDouble();
        fatura.preco_item(preco_uni);

        System.out.println();
        System.out.println("Atualizado: " + fatura);

        sc.close();
    }
}
