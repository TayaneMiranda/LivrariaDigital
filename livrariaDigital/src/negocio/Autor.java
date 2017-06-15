package negocio;

public class Autor {
	
	//ATRIBUTOS
	private String nomeAutor;
	private Livro livroPublicado; 
	
	//CONSTRUTOR
	
	public Autor (String nomeAutor, Livro livroPublicado){
		this.nomeAutor = nomeAutor;
		this.livroPublicado = livroPublicado; 
	}

	
	//METODOS GETTER AND SETTERS  
	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public Livro getLivroPublicado() {
		return livroPublicado;
	}

	public void setLivroPublicado(Livro livroPublicado) {
		this.livroPublicado = livroPublicado;
	}
	
	
	
	

}
