package LivrariaDigital.Dados;

import LivrariaDigital.Negocio.beans.Compra;

public class RepositorioCompras {
	
	private final static int TAM_MAX = 100;
	
	private Compra[] compras;
	private int proxima;
	
	
	
	public RepositorioCompras(){
		this.compras = new Compra[TAM_MAX];
		this.proxima = 0;
	}
	
	
	public RepositorioCompras(int tamanho) {
		this.compras = new Compra[tamanho];
		this.proxima = 0;
	}
	
	
	
	private int retornarPosicao(String numero) {

		if (numero == null) {
			return -1;
		}
		
		for (int i = 0; i< this.proxima; i++){
			if (numero.equals( compras[i].getNumeroCompra() ) ) {
				return i;
			} 
		}
		
		return -1;
	}
	
	//INSERIR
	public void inserirCompra(Compra compra){
		if (compra == null) {
			System.out.println("Compra não realizada: " + compra);
			return;
		}
		
		if(proxima == this.compras.length ) {
			System.out.println("repositorio cheio");
			return;
		}
		
		this.compras[this.proxima] = compra;
		this.proxima++;
	}
	
	//BUSCAR
	public Compra buscarCompra(String numero) {
		
		int posicao = this.retornarPosicao(numero);
		
		return (posicao != -1) ? this.compras[posicao] : null; 
	}
	
	public boolean existe(String numero) {
		return this.retornarPosicao(numero) != -1;
	}
	

	//ATUALIZAR
	public void atualizarCompra(Compra compraAtualizada) {
		
		if (compraAtualizada == null) {
			System.out.println("Compra invalida!");
			return;
		}
		
		int posicaoCompraAserAtualizada = this.retornarPosicao(compraAtualizada.getNumeroCompra());
		if (posicaoCompraAserAtualizada == -1) {
			System.out.println("Compra inexistente, numero: " + compraAtualizada.getNumeroCompra());
			return;
		}
		this.compras[posicaoCompraAserAtualizada] = compraAtualizada;
	}
	
	
	//REMOVER
public void removerCompra(String numero) {
		
		int posicaoCompraASerRemovida = this.retornarPosicao(numero);
		
		if (posicaoCompraASerRemovida == -1) {
			System.out.println("Compra inexistente!!");
			return;
		}
		
		this.compras[posicaoCompraASerRemovida] = this.compras[this.proxima -1];
		this.compras[this.proxima - 1] = null;
		this.proxima = this.proxima - 1;
		
		System.out.println("Compra removida com sucesso, numero: " + numero);
		
	}
	
	
	
	
	
}
