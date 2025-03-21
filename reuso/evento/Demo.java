public class Demo {
    public static void main(String[] args) {
        EventoHeranca e1 = new EventoHeranca(10, 30, 0, 1, 1, 2020, "Ano Novo");
        System.out.println(e1);
        EventoDelegacao e2 = new EventoDelegacao(10, 30, 0, 1, 1, 2020, "Ano Novo");
        System.out.println(e2);
    }
}
