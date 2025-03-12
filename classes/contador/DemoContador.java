public class DemoContador {
    public static void main(String[] args) {
        Contador c1 = new Contador(10);
        c1.incrementa();
        c1.incrementa();
        c1.incrementa();
        c1.incrementa();
        c1.incrementa();
        c1.incrementa();
        c1.incrementa();
        c1.incrementa();
        c1.incrementa();
        c1.incrementa();
        System.out.println("Valor de c1: " + c1.mostraValor());
        c1.zerar();
        System.out.println("Valor de c1: " + c1.mostraValor());
    }
}
