public class DemoFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("João", 1000);
        Assistente a1 = new Assistente("Maria", 1500, "1234");
        Tecnico t1 = new Tecnico("José", 2000, "5678", "Informática");
        Administrativo ad1 = new Administrativo("Ana", 2500, "9012", "Noturno");

        f1.aumentarSalario(100);

        f1.ganhoAnual();

        System.out.println(f1);
        System.out.println(a1);
        System.out.println(t1);
        System.out.println(ad1);
    }
}
