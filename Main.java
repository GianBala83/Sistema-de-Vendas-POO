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
        int op2 = -1;
        
        // Menu Principal da Aplicação
        do{
            Functions.CleanConsole();
            System.out.println("===================================");
            System.out.println("DGHM - Distribuidora LTDA");
            System.out.println("===================================");
            System.out.println("1 - Realizar Cadastro");
            System.out.println("2 - Gerenciar Vendas");
            System.out.println("3 - Gerenciar Estoque");
            System.out.println("4 - Mostra Cadastros");
            System.out.println("0 - Sair");
            op = sc.nextInt();

            if (op == 1){
                Functions.CleanConsole();
                System.out.println("1 - Cadastrar Cliente");
                System.out.println("2 - Cadastrar Fornecedor");
                System.out.println("3 - Cadastrar Produto");
                System.out.println("0 - Voltar");
                op2 = sc.nextInt();
                if (op2 == 1){
                Cadastros.Cadastrar_Cliente(Lista_Clientes);
                }
                op2 = -1;
            }
            else if (op == 4){
                Functions.CleanConsole();
                System.out.println("1 - Cliente");
                System.out.println("2 - Fornecedor");
                System.out.println("3 - Produto");
                System.out.println("0 - Voltar");
                op2 = sc.nextInt();
                // Cada um vai te uma função em lugar especifico
                // isso aqui é temporario
                if (op2 == 1){
                    Functions.CleanConsole();
                    int len = Lista_Clientes.size();
                    for (int i = 0; i<len; i++){
                        System.out.println("===================================");
                        Lista_Clientes.get(i).Mostra_Cliente();
                        System.out.println("===================================");
                    }
                    Functions.PauseConsole();
                }
                op2 = -1;
                
            }

        }while(op != 0);
        
        

        // Os métodos de gravação deveram ser chamados no final do programa
        Arquivo.writter("Clientes.txt", Lista_Clientes);
    }

    // Move para cadastro essa função//
    //public static void Cadastra_Client(Clients Clientes){


//    }
}
