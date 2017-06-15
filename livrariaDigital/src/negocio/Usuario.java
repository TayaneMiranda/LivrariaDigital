package negocio;

public class Usuario {
	
	//ATRIBUTOS 
	
	private String nome;
	private String senha;
	private int cpf; 

	
	// CONSTRUTOR
	
	public Usuario (String nome, String senha, int cpf){
		this.nome = nome;
		this.senha = senha;
		this.cpf = cpf;
				
	}

	//METODOS GETTER AND SETTERS  

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public int getCpf() {
		return cpf;
	}


	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	
	

}
