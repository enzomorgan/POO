
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
        if (andarAtual > 0) {
            andarAtual--;
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getPessoas() {
        return pessoas;
    }

    public String toString() {
        return "Andar atual: " + andarAtual + "\nTotal de andares: " + totalAndares + "\nCapacidade: " + capacidade + "\nPessoas: " + pessoas;
    }

}
