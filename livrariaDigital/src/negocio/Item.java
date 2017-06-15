package negocio;

public class Item {
	
	//ATRIBUTOS
	private int qtd;
	private double preco;
	
	
	//CONSTRUTOR
	public Item(int qtd, double preco){
		this.qtd = qtd;
		this.preco= preco;
		
	}

	
	//METODOS GETTERS AND SETTERS 

	public int getQtd() {
		return qtd;
	}


	public void setQtd(int qtd) {
		this.qtd = qtd;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	

}
