package entities;

public class ContaCorrente extends Conta {
	
	private int contTalao;
	
	public ContaCorrente(int numeroConta) {
		super(numeroConta);
		
	}

	public int getContTalao() {
		return contTalao;
	}

	public void setContTalao(int contTalao) {
		this.contTalao = contTalao;
	}

	
	
	
}