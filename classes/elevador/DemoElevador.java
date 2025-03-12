public class DemoElevador {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(10, 5);
        elevador.entra();
        elevador.entra();
        elevador.entra();
        elevador.sobe();
        elevador.sobe();
        elevador.sobe();
        elevador.desce();
        elevador.desce();
        elevador.desce();
        elevador.sai();
        elevador.sai();
        elevador.sai();
        elevador.sai();

        System.out.println(elevador);

    }
}
