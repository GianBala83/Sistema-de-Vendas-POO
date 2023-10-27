//
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//
import objetos.*;
import funcoes.*;

public class Main {
    
    public static Scanner sc = new Scanner(System.in);

    public static void main (String args[]){
        
        // Vamos te que usar coleções aqui
        List<Cliente> Lista_Clientes = new ArrayList<>();
        //Clients Lista_Clientes[] = new Clients[5];


        // Os métodos de leitura deveram ser chamados no inicio do programa
        Arquivo.reader("Clientes.txt", Lista_Clientes);

        int op = -1;
        
        do{
            System.out.println("DGHM - Distribuidora LTDA");
            System.out.println("1 - Cadastra Clients");
            System.out.println("2 - Mostrar Clients");
            System.out.println("0 - Sair");
            op = sc.nextInt();

            if (op == 1){
                Cadastros.Cadastrar_Cliente(Lista_Clientes);
            }
            else if (op == 2){
                int len = Lista_Clientes.size();
                for (int i = 0; i<len; i++){
                    System.out.println("===================================");
                    Lista_Clientes.get(i).Mostra_Client();
                    System.out.println("===================================");
                }
            }

        }while(op != 0);
        
        

        // Os métodos de gravação deveram ser chamados no final do programa
        Arquivo.writter("Clientes.txt", Lista_Clientes);
    }

    // Move para cadastro essa função//
    //public static void Cadastra_Client(Clients Clientes){


//    }
}
