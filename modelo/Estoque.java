package modelo;

public class Estoque{
	private int id_estoque;
	private int id_produto;
	private int quantidade;

	public void setIdEstoque(int id_estoque) {
		this.id_estoque = id_estoque;
	}
	public int getIdEstoque(){
		return id_estoque;
	}
	public void setIdProduto(int id_produto) {
		this.id_produto = id_produto;
	}
	public int getIdProduto(){
		return id_produto;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getQuantidade(){
		return quantidade;
	}

}
