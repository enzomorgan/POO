package energia;

public class Lampada {
    public boolean estadoDaLampada;
    public int estado = 0;

    public void acende(){
        if(!estadoDaLampada){
            estadoDaLampada = true;
            estado++;
            System.out.println("lampada acessa!");
        }
        else{
            System.out.println("lampada apagada!");
        }
    }

    public void apaga(){
        if(estadoDaLampada){
            estadoDaLampada = false;
            System.out.println("lampada apagada!");
        }
        else{
            System.out.println("lampada acessa!");
        }
    }

    public void mostraEstado(){
        System.out.println(estadoDaLampada);
        System.out.println(estado);
    }

    public int vezesAcessa(){
        return estado;
    }

}
