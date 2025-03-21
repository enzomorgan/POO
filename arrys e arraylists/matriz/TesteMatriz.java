public class TesteMatriz {
    public static void main(String[] args) {

        Matriz m = new Matriz(1, 2, 3, 4);

        m.exibirMatriz();
        System.out.println("Determinante: " + m.calcularDeterminante());

    }
}