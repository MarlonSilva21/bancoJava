package entities;

public class ContaEmpresarial extends Conta {
	
	private double limiteEmpresarial;

	public ContaEmpresarial(int numeroConta, double limiteEmpresarial) {
		super(numeroConta);
		this.limiteEmpresarial = limiteEmpresarial;
	}

	public double getLimiteEmpresarial() {
		return limiteEmpresarial;
	}

	public void setLimiteEmpresarial(double limiteEmpresarial) {
		this.limiteEmpresarial = limiteEmpresarial;
	}
	
	
}