package metodos;

public class Estaticos {

    public static int maior_Dois(int num, int num2){
        return Math.max(num, num2);
    }

    public static double maiores_dois(double num, double num2){
        return Math.max(num, num2);
    }

    public static int maior_tres(int num, int num2, int num3){
        return Math.max(Math.max(num, num2), num3);
    }

    public static double maiores_tres(double num, double num2, double num3){
        return Math.max(Math.max(num, num2), num3);
    }

    public static int maior_quatro(int num, int num2, int num3, int num4){
        return Math.max(Math.max(Math.max(num, num2), num3), num4);
    }

    public static double maiores_quatro(double num, double num2, double num3, double num4){
        return Math.max(Math.max(Math.max(num, num2), num3), num4);
    }

    public static int maior_cinco(int num, int num2, int num3, int num4, int num5){
        return Math.max(Math.max(Math.max(Math.max(num, num2), num3), num4), num5);
    }

    public static double maiores_cinco(double num, double num2, double num3, double num4, double num5){
        return Math.max(Math.max(Math.max(Math.max(num, num2), num3), num4), num5);
    }

}
