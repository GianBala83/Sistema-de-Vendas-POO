public class Fornecedor 
{
    private int id_fornecedor;
    private String nome;
    private String telefone;
    private String CNPJ;

    public Fornecedor(int id_fornecedor,String nome,String telefone,String CNPJ)
    {
        this.id_fornecedor = id_fornecedor;
        this.nome = nome;
        this.telefone = telefone;
        this.CNPJ = CNPJ;
    }
    public void Mostra_Fornecedor()
    {
        System.out.printf("Nome    :%s\n", this.nome);
        System.out.printf("CNPJ     :%11s\n", this.CNPJ);
        System.out.printf("Telefone:%s\n", this.telefone);
        System.out.printf("ID:%s\n", this.id_fornecedor);

    }
     // Fazer os gets e Sets;
}
