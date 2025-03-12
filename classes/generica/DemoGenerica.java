public class DemoGenerica {
    public static void main(String[] args) {
        Generica<Integer> generica = new Generica<>(1, 2, 2);
        generica.imprimir();
        System.out.println("Atributos iguais: " + generica.contarAtributosIguais());
    }
}
