import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args){
        ArrayList <Cliente> clientes = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        
        int op;

        do {
            System.out.println("1- Cadastrar cliente");
            System.out.println("2- Listar clientes");
            op = scanner.nextInt();

            switch(op){
                case 1:
                    System.out.println("Digite o id do cliente: ");
                    int id = scanner.nextInt();
                    System.out.println("Digite o nome do cliente: ");
                    String nome = scanner.next();
                    System.out.println("Digite o cpf do cliente: ");
                    int cpf = scanner.nextInt();
                    System.out.println("Digite o telefone do cliente: ");
                    int telefone = scanner.nextInt();

                    Cliente cliente = new Cliente(id, nome, cpf, telefone);
                    clientes.add(cliente);
                    break;
                case 2:
                    for(Cliente c : clientes){
                        System.out.println(c);
                    }
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while(op < 1);

        scanner.close();
    }
}
