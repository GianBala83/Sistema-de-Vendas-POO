import java.util.ArrayList;
import java.util.List;

public class Main {
    

    public static void main (String args[]){
        
        // Vamos te que usar coleções aqui
        List<Clients> Lista_Clientes = new ArrayList<>();
        //Clients Lista_Clientes[] = new Clients[5];


        // Os métodos de leitura deveram ser chamados no inicio do programa
        Arquivos.reader("Clientes.txt", Lista_Clientes);
        
        
        Lista_Clientes.get(0).Mostra_Client();

        // Os métodos de gravação deveram ser chamados no final do programa
        Arquivos.writter("Clientes.txt", Lista_Clientes);
    }

    // Move para cadastro essa função//
    //public static void Cadastra_Client(Clients Clientes){


//    }
}
