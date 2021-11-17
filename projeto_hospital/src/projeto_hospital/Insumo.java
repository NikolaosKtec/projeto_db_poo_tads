package projeto_hospital;

public class Insumo {
	private int quantidade;
	private String validade;
	private String lote;
	private String nome;
	
	public Insumo() { }
	
	public void retirada(int qtd, String nome, String lote) {
		
		if(this.consultaSaldo(qtd)) {
			System.out.println("Requisição " + lote + " Produto " + nome + " de " + qtd + " realizado.");			
		}
	}
	
	public boolean consultaSaldo(int retirada) {
		if(this.quantidade - retirada >= 0) {
			return true;
		}
		return false;
	}
}
