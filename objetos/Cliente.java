package objetos;

public class Cliente {
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

    // Sets
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    // Construtor
    public  Cliente (String nome, String telefone, String CPF, String endereco){
        //this.id_client = 1;
        this.nome = nome;
        this.telefone = telefone;
        this.CPF = CPF;
        this.endereco = endereco;
    }
    
    // Outros
    public void Mostra_Cliente(){
        System.out.printf("Nome    :%s\n", this.nome);
        System.out.printf("CPF     :%11s\n", this.CPF);
        System.out.printf("Telefone:%s\n", this.telefone);
        System.out.printf("Endereço:%s\n", this.endereco);

    }
    
}
