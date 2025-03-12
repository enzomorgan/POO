public class DemoNota {
    public static void main(String[] args) {
        Nota n = new Nota(123333, "Joao", 5.0, 6.0, 7.0);

        System.out.println("Media: " + n.media());
        System.out.println("Prova Final: " + n.provaFinal());
    }
}
