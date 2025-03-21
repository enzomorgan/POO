public class DemoAgenda {
    public static void main(String[] args){
        Agenda agenda = new Agenda();
        agenda.addCompromisso(10, 1, 1, 2020, "Ano Novo");
        agenda.addCompromisso(12, 25, 12, 2020, "Natal");
        agenda.addCompromisso(0, 1, 1, 2021, "Ano Novo");
        agenda.addCompromisso(0, 25, 12, 2021, "Natal");
        agenda.listaDia(1, 1, 2020);
        agenda.listaDia(25, 12, 2020);
        agenda.listaDia(1, 1, 2021);
        agenda.listaDia(25, 12, 2021);
    }
}
