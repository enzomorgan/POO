public class Contador {
    private int valor;

    public Contador(int valor){
        this.valor = valor;
    }

    public void incrementa(){
        valor++;
    }

    public void zerar(){
        this.valor = 0;
    }

    public int mostraValor(){
        return valor;
    }
}
