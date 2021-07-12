package entities;

public class ContaEspecial extends Conta {

	private double limiteEspecial;

	public ContaEspecial(int numeroConta, double limiteEspecial) {
		super(numeroConta);
		this.limiteEspecial = limiteEspecial;
	}

	public double getLimiteEspecial() {
		return limiteEspecial;
	}

	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}
	
	

}