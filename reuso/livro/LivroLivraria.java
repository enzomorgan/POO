public class LivroLivraria extends Livro {
    private String editora;

    public LivroLivraria(String titulo, String autor, int anoLan, String editora) {
        super(titulo, autor, anoLan);
        this.editora = editora;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return super.toString() + " Editora: " + editora;
    }
}
