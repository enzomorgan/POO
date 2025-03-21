public class Computador extends Equipamento {
    private String placaMae;
    private String fonte;

    public Computador(String ssd, String processador, String placaMae, String fonte){
        super(ssd, processador);
        this.placaMae = placaMae;
        this.fonte = fonte;
    }

    public String getPlacaMae(){
        return placaMae;
    }

    public String getFonte(){
        return fonte;
    }

    public void setPlacaMae(String placaMae){
        this.placaMae = placaMae;
    }

    public void setFonte(String fonte){
        this.fonte = fonte;
    }

    @Override
    public String toString(){
        return super.toString() + " Placa mãe: " + placaMae + " Fonte: " + fonte;
    }
}
