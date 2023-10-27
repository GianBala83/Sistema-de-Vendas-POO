public class Main {
    

    public static void main (String args[])
    {
        Clients edcarlos = new Clients("Edcarlos", "83 9999-9999", "666.666.666.81", "Rua X");
        Fornecedor CasasBahia = new Fornecedor(1,"Casas Bahia", "47028922", "123.456.789.98");
        edcarlos.Mostra_Client();
        CasasBahia.Mostra_Fornecedor();
    }
}
