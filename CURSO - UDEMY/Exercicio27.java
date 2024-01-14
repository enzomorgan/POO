

import java.util.Scanner;

import escola.Nota;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Nota nota = new Nota();

        System.out.print("Name: ");
        nota.nome = sc.nextLine();
        System.out.println("Notas: ");
        nota.n1 = sc.nextDouble();
        nota.n2 = sc.nextDouble();
        nota.n3 = sc.nextDouble();

        nota.Student();

        sc.close();
    }
}
