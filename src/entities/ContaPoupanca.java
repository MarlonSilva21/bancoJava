package entities;

public class ContaPoupanca extends Conta{

	private int diaAniversarioPoupanca;
	
	public ContaPoupanca(int numeroConta, int diaAniversarioPoupanca) {
		super(numeroConta);
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}

	public int getDiaAniversarioPoupanca() {
		return diaAniversarioPoupanca;
	}

	public void setDiaAniversarioPoupanca(int diaAniversarioPoupanca) {
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}
	
	
}