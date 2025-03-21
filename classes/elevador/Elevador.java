
public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoas;

    public Elevador(int totalAndares, int capacidade) {
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.andarAtual = 0;
        this.pessoas = 0;
    }

    public void entra() {
        if (pessoas < capacidade) {
            pessoas++;
        }
    }

    public void sai() {
        if (pessoas > 0) {
            pessoas--;
        }
    }

    public void sobe() {
        if (andarAtual < totalAndares) {
            andarAtual++;
        }
    }

    public void desce() {
        if (andarAtual >= 0) {
            andarAtual--;
        }
        System.out.println("o elevador ja esta no terreo");
    }

    public String toString() {
        return "Andar atual: " + andarAtual + "\nTotal de andares: " + totalAndares + "\nCapacidade: " + capacidade + "\nPessoas: " + pessoas;
    }

}
