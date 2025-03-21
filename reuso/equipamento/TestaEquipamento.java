public class TestaEquipamento {
    public static void main(String[] args) {

        Equipamento e = new Equipamento("500GB", "i7");
        System.out.println(e);
        Computador c = new Computador("500GB", "i7", "Asus", "500W");
        System.out.println(c);
    }
}
