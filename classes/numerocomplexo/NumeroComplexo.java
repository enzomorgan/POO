public class NumeroComplexo {
    private double real;
    private double imaginario;

    public NumeroComplexo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public NumeroComplexo(double real) {
        this.real = real;
    }

    public NumeroComplexo(){};

    public String toString(){
        return real + " + " + imaginario + "i";
    }
}
