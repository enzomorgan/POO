public class LivroBiblioteca extends Livro{
    private String secao;

    public LivroBiblioteca(String titulo, String autor, int anoLan, String secao) {
        super(titulo, autor, anoLan);
        this.secao = secao;
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }

    @Override
    public String toString() {
        return super.toString() + " Secao: " + secao;
    }
}
