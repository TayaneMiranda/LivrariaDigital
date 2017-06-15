package negocio;

public class Livro {
	
	//ATRIBUTOS
	
	private String titulo;
	private Autor autor;
	private int codigoLivro;
	private int ano;
	
	
	//CONSTRUTOR
	
	public Livro (String titulo, Autor autor, int codigoLivro, int ano ){
		this.titulo = titulo;
		this.autor = autor;
		this.codigoLivro = codigoLivro;
		this.ano = ano;
  }

	//METODOS GETTERS AND SETTERS

	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public Autor getAutor() {
		return autor;
	}


	public void setAutor(Autor autor) {
		this.autor = autor;
	}


	public int getCodigoLivro() {
		return codigoLivro;
	}


	public void setCodigoLivro(int codigoLivro) {
		this.codigoLivro = codigoLivro;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}
	
	

	
}