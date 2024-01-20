package dolar;

public class CurrencyConverter {

    public static double dolar_tax(double dolar, double price){
        double value = price * dolar;
        double value_tax = value / (1 - 0.06);
        return value_tax;
    }
}
