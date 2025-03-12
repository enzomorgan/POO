public class Fatura {
    int num_id;
    String desc;
    int quant;
    double preco;

    Fatura(int num_id, String desc, int quant, double preco){
        this.num_id = num_id;
        this.desc = desc;
        this.quant = quant;
        this.preco = preco;
    }

    double calculaTotal(){
        return quant * preco;
    }
}
