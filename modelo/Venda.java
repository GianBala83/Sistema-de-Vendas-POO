package modelo;

public class Venda {
    private int id_venda;
    private String nome_cliente;
    private String nome_produto;
    private int quantidade;
    private double valor_unitario;
    private double valor_total;
    private String data;

    public void setIdVenda(int id_venda){
        this.id_venda = id_venda;
    }
    public int getIdVenda(){
        return id_venda;
    }
    public void setNomeCliente(String nome_cliente){
        this.nome_cliente = nome_cliente;
    }
    public String getNomeCliente(){
        return nome_cliente;
    }
    public void setNomeProduto(String nome_produto){
        this.nome_produto = nome_produto;
    }
    public String getNomeProduto(){
        return nome_produto;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setValorUnitario(double valor_unitario){
        this.valor_unitario = valor_unitario;
    }
    public double getValorUnitario(){
        return valor_unitario;
    }
    public void setValorTotal(double valor_total){
        this.valor_total = valor_total;
    }
    public double getValorTotal(){
        return valor_total;
    }
    public void setData(String data){
        this.data = data;
    }
    public String getData(){
        return data;
    }
}
