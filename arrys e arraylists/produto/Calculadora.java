public class Calculadora {
    public static int produto(int... numeros){
        int resultados = 1;
        for (int numero : numeros) {
            resultados *= numero;
        }
        return resultados;
    }
}
