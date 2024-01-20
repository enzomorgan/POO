package cartao;

public class Fatura {
    public int num_ind;
    public String descricao;
    public int quantidade;
    public double preco_uni;

    public void quantity(int quantidade){
        this.quantidade += quantidade;
        if(quantidade < 0){
            System.out.println("0");
        }
    }

    public void removeProducts(int quantidade){
        this.quantidade -= quantidade;
        if(quantidade < 0){
            System.out.println("0");
        }
    }

    public void preco_item(double preco_uni){
        this.preco_uni += preco_uni;
        if(preco_uni < 0){
            System.out.println("0");
        }
    }

    public double calculaTotal(){
        return quantidade * preco_uni;
    }

    public String toString(){
        return num_ind
            + ", R$"
            + String.format("%.2f", preco_uni)
            + ", "
            + quantidade
            + " unidades, Total R$ "
            + String.format("%.2f", calculaTotal());
    }
}
