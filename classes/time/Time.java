public class Time{
    String nome;
    int num_jog;
    String tecnico;
    String cor_unif;

    Time(String nome, int num_jog, String tecnico, String cor_unif){
        this.nome = nome;
        this.num_jog = num_jog;
        this.tecnico = tecnico;
        this.cor_unif = cor_unif;
    }

    void mostraTime(){
        System.out.println("Nome: " + nome);
        System.out.println("Numero de jogadores: " + num_jog);
        System.out.println("Tecnico: " + tecnico);
        System.out.println("Cor do uniforme: " + cor_unif);
    }
}