package modelo;

public class Produto{
	private int id_produto;
	private String nome;
	private double valor;
	

	public void setIdProduto(int id_produto) {
		this.id_produto = id_produto;
	}
	public int getIdProduto(){
		return id_produto;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome(){
		return nome;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getValor(){
		return valor;
	}
	
}