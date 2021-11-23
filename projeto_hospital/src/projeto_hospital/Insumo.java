package projeto_hospital;

public class Insumo implements Produto {
	
	private int quantidade;
	private String validade;
	private String lote;
	private int idProduto;
	
	public Insumo() { }
	public boolean saldo(int idProduto) {
		if(this.quantidade >= 0) {
			return true;
		}
		return false;
	}
	
	public void retirada(int quantidade, int idProduto, String lote) {
		
		if(this.saldo(idProduto)) {
			this.quantidade -= quantidade;
			System.out.println("Requisição " + lote + " realizado com sucesso.");			
		}
	}
	
	public boolean validadeProd(int idProduto) {
		//implementar...
		this.validade = "";
		return true;
	}
	
}
 