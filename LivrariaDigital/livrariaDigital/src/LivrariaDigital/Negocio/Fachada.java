package LivrariaDigital.Negocio;

import LivrariaDigital.Negocio.beans.Usuario;

public class Fachada {

	
private static Fachada instancia;
	
	private ControladorUsuario cadastroUsuario;
	private ControladorCompra cadastroCompra;
	private ControladorLivro cadastroLivro;
	private ControladorAutor cadastroAutor;
	
	private Fachada(){
		this.cadastroUsuario = new ControladorUsuario();
		this.cadastroCompra = new ControladorCompra();
		this.cadastroLivro = new ControladorLivro();
		this.cadastroAutor = new ControladorAutor();
	}
	
	public static Fachada obterInstancia() {
		
		if (instancia == null) {
			instancia = new Fachada();
		}

		return instancia;
		
	}	
	

	//USUARIO
	public void cadastrarUsuario(Usuario usuario) {
		cadastroUsuario.cadastrar(usuario);
	}

	public void buscarUsuario(Usuario usuario) {
		cadastroUsuario.buscar(usuario);
	}
	
	public void atualizarUsuario(Usuario usuario) {
	//	cadastroUsuario.atualizar(usuario);
	}
	
	public void removerUsuario(Usuario usuario) {
		cadastroUsuario.remover(usuario);
	}

	
	//LIVRO



}
