public class Generica <G>{
    private G primeiro;
    private G segundo;
    private G terceiro;

    public Generica(G primeiro, G segundo, G terceiro) {
        this.primeiro = primeiro;
        this.segundo = segundo;
        this.terceiro = terceiro;
    }

    public int contarAtributosIguais() {
        int cont = 0;
        if (primeiro.equals(segundo)) {
            cont++;
        }
        if (primeiro.equals(terceiro)) {
            cont++;
        }
        if (segundo.equals(terceiro)) {
            cont++;
        }

        if(cont == 2) cont = 3;

        return cont;
    }

    public void imprimir () {
        System.out.println("Primeiro: " + primeiro + " Segundo: " + segundo + " Terceiro: " + terceiro);
    }
}
