//Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
//qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$. Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
//mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.


import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        double imposto, valor;

        System.out.println("Informe a renda: ");
        valor = x.nextDouble();

        if(valor > 0.00 && valor <= 2000.00){
            System.out.println("Isento");
        }
        else if(valor > 2000.01 && valor <= 3000.00){
            imposto = valor * 0.8;
            System.out.println("Imposto de renda: R$ " + imposto); 
        }
        else if(valor > 3000.01 && valor <= 4500.00){
            imposto = valor * 0.18;
            System.out.println("Imposot de renda: R$ " + imposto);
        }
        else if(valor > 4500.00){
            imposto = valor * 0.28;
            System.out.println("Imposto de renda: R$ " + imposto);
        }


        
        x.close();
    }    
}
