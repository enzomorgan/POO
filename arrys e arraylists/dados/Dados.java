import java.util.Random;

public class Dados {
    public static void main(String[] args) {
        Random random = new Random();
        int[] frequencias = new int[13];

        for (int i = 0; i < 36000000; i++) {
            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt(6) + 1;
            int soma = dado1 + dado2;
            frequencias[soma]++;
        }

        System.out.println("Soma\tFrequência");
        for (int soma = 2; soma <= 12; soma++) {
            System.out.println(soma + "\t" + frequencias[soma]);
        }
    }
}
