

public class Nota {
    int matricula;
    String nome;
    double P1, P2, T;

    Nota(int matricula, String nome, double P1, double P2, double T){
        this.matricula = matricula;
        this.nome = nome;
        this.P1 = P1;
        this.P2 = P2;
        this.T = T;
    }

    double MP, EF;

    double media(){
        return MP = (2.5*P1 + 2.5*P2 + 2*T)/7;
    }

    double provaFinal(){

        if(MP < 3 || MP >= 7){
            MP = 0;
        }

        EF = (5 * 10 - MP * 6)/4;
        return EF;
    }
}
