public class Demo {
    public static void main(String[] args) {
        LivroDeBiblioteca livro = new LivroDeBiblioteca("O Senhor dos Anéis", "J.R.R. Tolkien", 1200, 1954, "Corredor 3, Prateleira B");
        
        System.out.println(livro.descricao());
        System.out.println("Localização: " + livro.localizacao());
        System.out.println("Está emprestado? " + livro.estaEmprestado());
        
        livro.empresta();
        System.out.println("Livro emprestado. Está emprestado agora? " + livro.estaEmprestado());
        
        livro.devolve();
        System.out.println("Livro devolvido. Está emprestado agora? " + livro.estaEmprestado());
    }
}