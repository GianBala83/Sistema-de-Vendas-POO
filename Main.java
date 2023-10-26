public class Main {
    

    public static void main (String args[]){
        
        // Vamos te que usar coleções aqui
        Clients Lista_Clientes[] = new Clients[1];


        // Os métodos de leitura deveram ser chamados no inicio do programa
        Arquivos.reader("Clientes.txt", Lista_Clientes);
        
        
        Lista_Clientes[0].Mostra_Client();

        // Os métodos de gravação deveram ser chamados no final do programa
        Arquivos.writter("Clientes.txt", Lista_Clientes);
    }
}
