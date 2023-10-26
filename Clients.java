public class Clients {
    //private int id_client;
    private String nome;
    private String telefone;
    private String CPF;
    private String endereco;


    // Gets
    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getCPF() {
        return CPF;
    }
    public String getEndereco() {
        return endereco;
    }



    public  Clients (String nome, String telefone, String CPF, String endereco){
        //this.id_client = 1;
        this.nome = nome;
        this.telefone = telefone;
        this.CPF = CPF;
        this.endereco = endereco;
    }
    
    public void Mostra_Client(){
        System.out.printf("Nome    :%s\n", this.nome);
        System.out.printf("CPF     :%11s\n", this.CPF);
        System.out.printf("Telefone:%s\n", this.telefone);
        System.out.printf("Endereço:%s\n", this.endereco);

    }
    
}
