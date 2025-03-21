public class Livro {
    private String titulo;
    private String autor;
    private int anoLan;

    public Livro(String titulo, String autor, int anoLan) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoLan = anoLan;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoLan() {
        return anoLan;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoLan(int anoLan) {
        this.anoLan = anoLan;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + " Autor: " + autor + " Ano de Lancamento: " + anoLan;
    }
}
