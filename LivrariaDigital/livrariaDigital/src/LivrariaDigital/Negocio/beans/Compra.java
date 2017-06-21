package LivrariaDigital.Negocio.beans;

public class Compra {
	
	//ATRIBUTOS
	private String data;
	private String numeroCompra;
	private String status;
	private Livro[] livros;
	
	
	//CONSTRUTORES
	
	public Compra (String data, String numeroCompra, String status){
		this.data = data; 
		this.numeroCompra = numeroCompra;
		this.status = status;
	}
	
	public Compra(){
		
	}

	//METODOS
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getNumeroCompra() {
		return numeroCompra;
	}

	public void setNumeroCompra(String numeroCompra) {
		this.numeroCompra = numeroCompra;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Livro[] getLivros() {
		return livros;
	}

	public void setLivros(Livro[] livros) {
		this.livros = livros;
	}

	
	
	
	
	
	
	
	
	
	
}



