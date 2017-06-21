package LivrariaDigital.Negocio.beans;

public class Usuario {
	
	//ATRIBUTOS 
	
	private String nome;
	private String senha;
	private int cpf; 

	
	// CONSTRUTORES
	
	public Usuario (){
		
	}
	
	public Usuario (String nome, String senha, int cpf){
		this.nome = nome;
		this.senha = senha;
		this.cpf = cpf;
				
	}
	
	public Usuario (String nome, int cpf){
		this.nome = nome;
		this.cpf = cpf;
	}
		

	//METODOS GETTERS AND SETTERS  

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

	
	public String toString() {
		return "Usuario [nome=" + nome + ", senha=" + senha + ", cpf=" + cpf + "]";
	}
	
	
	

}
