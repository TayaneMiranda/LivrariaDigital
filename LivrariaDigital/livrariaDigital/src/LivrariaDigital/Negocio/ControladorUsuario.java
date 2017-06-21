package LivrariaDigital.Negocio;

import LivrariaDigital.Dados.RepositorioUsuario;
import LivrariaDigital.Negocio.beans.Usuario;

public class ControladorUsuario {

	
	private RepositorioUsuario repoUsuario;
	
	public ControladorUsuario(){
		this.repoUsuario = new RepositorioUsuario();
	}
	
	public ControladorUsuario(RepositorioUsuario repo){
		this.repoUsuario = repo;
	}
	
	
	public void cadastrar(Usuario user) {
		//FAZER
	}

	public void remover(Usuario user) {
		//FAZER
	}

	public void buscar(Usuario user) {
		//FAZER
	}
	
	public void atualizar(String cpf) {
		
		//FAZER
	}
	
}
