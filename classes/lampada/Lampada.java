public class Lampada {
    public boolean estadoDaLampada;
    public int contador;

    public Lampada(){
        estadoDaLampada = false;
        contador = 0;
    }

    public void acende() {
        if (!estadoDaLampada) {
            estadoDaLampada = true;
            contador++;
        }
    }

    public void apaga() {
        estadoDaLampada = false;
    }

    public boolean estaLigada() {
        if (estadoDaLampada){
            System.out.println("A lampada esta acesa");
            return true;
        } else {
            System.out.println("A lampada esta apagada");
            return false;
        }
    }

    public void mostraContador() {
        System.out.println("O contador esta em: " + contador);
    }
}
