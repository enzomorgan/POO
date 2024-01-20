package esporte;

public class Time {
    public String nome;
    public int num_joga;
    public String esporte;

    public int remove_jog(int num_joga){
        return this.num_joga -= num_joga;
    }

    public int add_jog(int num_joga){
        return this.num_joga += num_joga;
    }
}
