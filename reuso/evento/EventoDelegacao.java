public class EventoDelegacao {
    private DataHora dh;
    private String nome;

    public EventoDelegacao(int hora, int min, int seg, int dia, int mes, int ano, String nome){
        DataHora dh = new DataHora(hora, min, seg, dia, mes, ano);
        this.nome = nome;
    }

    public EventoDelegacao(DataHora dh, String nome){
        this.dh = dh;
        this.nome = nome;
    }

    @Override
    public String toString(){
        return dh.toString() + " " + nome;
    }
}