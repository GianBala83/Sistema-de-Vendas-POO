package objetos;

public class Pedido {
    
    private int codigo;
    private String nome_cliente;
    private String produtos;
    private int quantidades;
    private double valor_total;

    // Gets
    public int getCodigo() {
        return codigo;
    }
    public String getNome_cliente() {
        return nome_cliente;
    }
    public String getProdutos() {
        return produtos;
    }
    public int getQuantidades() {
        return quantidades;
    }
    public double getValor_total() {
        return valor_total;
    }
    // Sets
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }
    public void setProdutos(String produtos) {
        this.produtos = produtos;
    }
    public void setQuantidades(int quantidades) {
        this.quantidades = quantidades;
    }
    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    // Construtor
    // Aqui vamos ter que trabalhar em algumas logicas como a determina o valor total etc.
    public Pedido(String nome_cliente, String produtos, int quantidades){
        this.nome_cliente = nome_cliente;
        this.produtos = produtos;
        this.quantidades = quantidades;
    }
}
