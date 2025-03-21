public class DemoLivro {
    public static void main(String[] args) {
        LivroBiblioteca lb = new LivroBiblioteca("Java", "Deitel", 2015, "Tecnologia");
        LivroLivraria ll = new LivroLivraria("Java", "Deitel", 2015, "Pearson");
        System.out.println(lb);
        System.out.println(ll);
    }
}
