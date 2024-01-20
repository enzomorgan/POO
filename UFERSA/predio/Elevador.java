package predio;

public class Elevador {
    public int num_andar;
    public int andares = 18;
    public int capacidade = 20, pessoas_pres;

    public void entra(int pessoas_pres){
        while (pessoas_pres < capacidade) {
            this.pessoas_pres += pessoas_pres;
            capacidade++;
                if(pessoas_pres == capacidade){
                    System.out.println("Elevador cheio");
                }
        }
    }

    public void sai(int pessoas_pres){
        this.pessoas_pres -= pessoas_pres;
        capacidade ++;
            if(pessoas_pres == 0 && capacidade == 20){
                System.out.println("Elevador vazio");
            }
    }

    public void sobe(int andares){
        while (num_andar < andares) {
            this.num_andar += num_andar;
                if(num_andar == andares){
                    System.out.println("Voce chegou ao ultimo andar");
                }
        }
    }

    public void desce(int andares){
        this.num_andar -= num_andar;
            if(num_andar == 0){
                System.out.println("Voce esta no terreo!");
            }
    }
}
