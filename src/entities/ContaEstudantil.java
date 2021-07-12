package entities;

public class ContaEstudantil extends Conta {
	
	private double limiteEstudantil;

	public ContaEstudantil(int numeroConta, double limiteEstudantil) {
		super(numeroConta);
		this.limiteEstudantil = limiteEstudantil;
	}

	public double getLimiteEstudantil() {
		return limiteEstudantil;
	}

	public void setLimiteEstudantil(double limiteEstudantil) {
	 		this.limiteEstudantil = limiteEstudantil;
	
	}
	
}