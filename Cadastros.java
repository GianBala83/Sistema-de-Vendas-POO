import java.util.List;
import java.util.Scanner;
public class Cadastros {

    private static Scanner sc = new Scanner(System.in);
    
    public static void Cadastrar_Cliente(List<Clients> Clientes){
        String nome;
        String telefone;
        String CPF;
        String Endereço;

        System.out.println("Digite o Nome do Cliente: ");
        nome = sc.nextLine();
        System.out.println("Digite o Telefone do Cliente: ");
        telefone = sc.nextLine();
        System.out.println("Digite o CPF do Cliente: ");
        CPF = sc.nextLine();
        System.out.println("Digite o Endereço do Cliente: ");
        Endereço = sc.nextLine();

        Clients atual = new Clients(nome, telefone, CPF, Endereço);

        Clientes.add(atual);


    }
}
