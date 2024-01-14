package escola;

public class Nota {
    public String nome;
    public double n1, n2, n3;


    public void Student(){
        double soma;
        soma = n1 + n2 + n3;
        if(soma >= 60.0){
            System.out.println("FINAL GRADE: " + soma);
            System.out.println("PASS");
        }

        double diferenca = 60.0 - soma;

        if(soma < 60.0){
            System.out.println("FINAL GRADE: " + soma);
            System.out.println("FAILED");
            System.out.println("MISSING " + diferenca + " POINTS");                       
        }
    }
}
