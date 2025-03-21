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

  public String toString(){
      return "Nome: " + nome + "/tNumero de jogadores: " + "/tTecnico: " + tecnico + "/tCor do uniforme: " + cor_unif;
  }
}
