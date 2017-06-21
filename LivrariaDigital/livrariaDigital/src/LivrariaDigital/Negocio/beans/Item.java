package LivrariaDigital.Negocio.beans;

public class Item {
	
	//ATRIBUTOS
	private int quantidade;
	private double preco;
	
	
	//CONSTRUTOR
	public Item(int quantidade, double preco){
		this.quantidade = quantidade;
		this.preco= preco;
		
	}

	
	//METODOS GETTERS AND SETTERS 

	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	
	public String toString() {
		return "Item [quantidade=" + quantidade + ", preco=" + preco + "]";
	}
	
	

}
