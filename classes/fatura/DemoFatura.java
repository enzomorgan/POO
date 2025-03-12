public class DemoFatura {
    public static void main(String[] args) {
        Fatura f = new Fatura (1, "Cadeira", 2, 100.0);

        f.calculaTotal();
        System.out.println("Total: " + f.calculaTotal());
    }
}
