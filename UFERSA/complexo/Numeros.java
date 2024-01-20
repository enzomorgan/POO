package complexo;

public class Numeros {

    public double real;
    public double imaginaria;

    public void pri_cons(double real, double imaginaria){
        this.real = real;
        this.imaginaria = imaginaria;
    }

    public void NumeroComplexo(double real){
        this.real = real;
        imaginaria = 0.0;
    }

    public void NUmeroC(){
        real = 0.0;
        imaginaria = 0.0;
    }

    public String toString(){
        if(imaginaria >= 0){
            return String.format("%.2f + %.2fi", real, imaginaria);
        }
        else{
            return String.format("%.2f + %.2fi", real, Math.abs(imaginaria));
        }
    }
}
