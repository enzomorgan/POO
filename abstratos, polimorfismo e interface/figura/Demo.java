public class Demo {
    public static void main(String[] args){
        Circulo c = new Circulo();
        Quadrado q = new Quadrado();
        Triangulo t = new Triangulo();
        FiguraGeometrica[] figuras = {c, q, t};
        for (FiguraGeometrica f : figuras) {
            f.descricao();
        }
    }
}
