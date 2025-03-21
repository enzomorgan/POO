public class EventoHeranca extends DataHora {
    private String nome;

    public EventoHeranca(int hora, int min, int seg, int dia, int mes, int ano, String nome){
        super(hora, min, seg, dia, mes, ano);
        this.nome = nome;
    }

    @Override
    public String toString(){
        return super.toString() + " " + nome;
    }
}
