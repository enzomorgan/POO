
import dolar.CurrencyConverter;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double dolar, price;

        System.out.print("What is the dollar price: ");
        dolar = sc.nextDouble();
        System.out.print("How many dollars will be bought: ");
        price = sc.nextDouble();

        double t = CurrencyConverter.dolar_tax(dolar, price);

        System.out.println("Amount to be paid in reais: " + t);

        sc.close();
    }
}
