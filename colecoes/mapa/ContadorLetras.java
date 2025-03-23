import java.util.Map;
import java.util.TreeMap;

public class ContadorLetras {
    public static void main(String[] args) {
        String texto = "HELLO THERE";
        contarLetras(texto);
    }

    public static void contarLetras(String texto) {
        Map<Character, Integer> mapaContagem = new TreeMap<>();

        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) { // Ignora espaços e caracteres não alfabéticos
                mapaContagem.put(c, mapaContagem.getOrDefault(c, 0) + 1);
            }
        }

        // Exibe o resultado ordenado alfabeticamente
        for (Map.Entry<Character, Integer> entrada : mapaContagem.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}
