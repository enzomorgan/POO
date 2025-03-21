public class DemoPessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Joao", 30);
        Politico pol = new Politico("Jose", 40, "PT");
        Governador gov = new Governador("Maria", 50, "PSDB", "SP");
        Prefeito pre = new Prefeito("Ana", 45, "PMDB", "Sao Paulo");

        System.out.println(p);
        System.out.println(pol);
        System.out.println(gov);
        System.out.println(pre);
    }
}