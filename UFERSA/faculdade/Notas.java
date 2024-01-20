package faculdade;

public class Notas {
  private int matricula;
  private String nome;
  private double p1, p2, T;
    
 
  public void aluno(int matricula, String nome, double p1, double p2, double T){
    this.matricula = matricula;
    this.nome = nome;
    this.p1 = p1;
    this.p2 = p2;
    this.T = T;
  }

  public double media(){
    return (2.5 * p1 + 2.5 * p2 + 2 * T) / 7;
  }

  public double provaFInal(){
    double MP = media();
      if(MP < 3 || MP >= 7){
        return 0.0;
      }
      else{
        return (5 - (MP * 6) / 4);
      }
    }      
  public boolean verificaAP(){
    double MP = provaFInal();

      if(MP >= 5){
        return true;
      }
      else{
        double PF = provaFInal();
        return (MP * 6 + PF * 4) / 10 >= 5;
      }
  }
    
}
