public class Matriz {
    private float[][] matriz;

    public Matriz(float a11, float a12, float a21, float a22) {
        matriz = new float[2][2];
        matriz[0][0] = a11;
        matriz[0][1] = a12;
        matriz[1][0] = a21;
        matriz[1][1] = a22;
    }

    public float calcularDeterminante() {
        return (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
    }

    public void exibirMatriz() {
        System.out.println("Matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("%.2f ", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
