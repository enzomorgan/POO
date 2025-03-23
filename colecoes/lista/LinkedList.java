public class LinkedList {
    private No cabeca;

    public LinkedList(){
        this.cabeca = null;
    }

    public void adicionar(char dado) {
        No novoNo = new No(dado);
        if (cabeca == null) {
            cabeca = novoNo;
        } else {
            No temp = cabeca;
            while (temp.proximo != null) {
                temp = temp.proximo;
            }
            temp.proximo = novoNo;
        }
    }

    public LinkedList inverter() {
        LinkedList listaInvertida = new LinkedList();
        No atual = cabeca;
        while (atual != null) {
            No novoNo = new No(atual.dado);
            novoNo.proximo = listaInvertida.cabeca;
            listaInvertida.cabeca = novoNo;
            atual = atual.proximo;
        }
        return listaInvertida;
    }

    public void exibir() {
        No temp = cabeca;
        while (temp != null) {
            System.out.print(temp.dado + " -> ");
            temp = temp.proximo;
        }
        System.out.println("null");
    }
}
