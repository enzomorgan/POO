public class DataHora {
    private Data estaData;
    private Hora estaHora;

    DataHora(int hora, int min, int seg, int dia, int mes, int ano){
        estaData = new Data(dia, mes, ano);
        estaHora = new Hora(hora, min, seg);
    }

    DataHora(int dia, int mes, int ano){
        estaData = new Data(dia, mes, ano);
        estaHora = new Hora(0,0,0);
    }

    @Override
    public String toString(){
        return estaData + " " + estaHora;
    }
}
