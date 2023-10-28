package objetos;

public class Fornecedor {
    private String nome;
    private String telefone;
    private String CNPJ;


    // Gets
    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getCNPJ() {
        return CNPJ;
    }

    // Sets
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setCNPJ(String cNPJ) {
        CNPJ = cNPJ;
    }

    // Construtor
    public Fornecedor (String nome, String telefone, String CNPJ){
        this.nome = nome;
        this.telefone = telefone;
        this.CNPJ = CNPJ;
    }

    // Outros
    public void Mostra_Fornecedor(){
        System.out.printf("Nome    :%s\n", this.nome);
        System.out.printf("CNPJ     :%11s\n", this.CNPJ);
        System.out.printf("Telefone:%s\n", this.telefone);
    }
}
