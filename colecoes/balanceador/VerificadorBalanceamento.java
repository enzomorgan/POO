import java.util.Stack;

public class VerificadorBalanceamento {
    public static void main(String[] args) {
        String[] testes = {"(()()()())", "(((())))", "(()((())()))", "(((((()))", "())))", "(()()(()"};
        
        for (String teste : testes) {
            System.out.println(teste + " -> " + (estaBalanceada(teste) ? "Balanceada" : "Não Balanceada"));
        }
    }

    public static boolean estaBalanceada(String expressao) {
        Stack<Character> pilha = new Stack<>();
        
        for (char c : expressao.toCharArray()) {
            if (c == '(') {
                pilha.push(c);
            } else if (c == ')') {
                if (pilha.isEmpty()) {
                    return false;
                }
                pilha.pop();
            }
        }
        
        return pilha.isEmpty();
    }
}
