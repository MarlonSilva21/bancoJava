package entities;

public class ContaPoupanca extends Conta {

	private int diaAniversarioPoupanca;
	int x=0,diaHj=0, numeroConta = 0,dataAniversario=0;
	char opcao;
	double valor=0.0;

	public ContaPoupanca(int numeroConta, int diaAniversarioPoupanca) {
		super(numeroConta);
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}
	//ENCAPSULAMENTO
	public int getDiaAniversarioPoupanca() {
		return diaAniversarioPoupanca;
	}

	public void setDiaAniversarioPoupanca(int diaAniversarioPoupanca) {
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	} 
	//MÉTODO
	public void poupanca(int data) {
		
		if (super.getSaldo()>0 && data == this.diaAniversarioPoupanca)
		{
			saldo = saldo + saldo*0.05;
		}
	
	}
	public void ContaPoupanca() {
		
	}
	
}