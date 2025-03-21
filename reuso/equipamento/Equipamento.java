public class Equipamento{
    private String ssd;
    private String processador;

    public Equipamento(String ssd, String processador){
        this.ssd = ssd;
        this.processador = processador;
    }

    public String getSsd(){
        return ssd;
    }

    public String getProcessador(){
        return processador;
    }

    public void setSsd(String ssd){
        this.ssd = ssd;
    }

    public void setProcessador(String processador){
        this.processador = processador;
    }

    @Override
    public String toString(){
        return "SSD: " + ssd + " Processador: " + processador;
    }
}