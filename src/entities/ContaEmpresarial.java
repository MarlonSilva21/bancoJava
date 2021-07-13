package entities;

import java.util.Scanner;

public class ContaEmpresarial extends Conta {
	
	private double valorLimiteSaldoInsuficiente;
	private double limiteEmpresarial;
	Scanner leia = new Scanner(System.in);

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
	
	@Override
	public void saque (double valorSaque) {
		if(valorSaque <= 0) {
			System.out.println("Operação inválida.");
		}
		
		else if (valorSaque>saldo  && limiteEmpresarial < (valorSaque - saldo)) {
			System.out.println("Saldo insuficiente.");
		}
		
		else if (valorSaque>saldo && limiteEmpresarial > (valorSaque - saldo)) {
			System.out.println("Saldo insuficiente.\nGostaria de usar o Limite Especial para completar a transação? [S/N]: ");
			char usarLimite = leia.next().toUpperCase().charAt(0);
				if (usarLimite == 'S') {
				valorLimiteSaldoInsuficiente = saldo - valorSaque;
				limiteEmpresarial -= valorLimiteSaldoInsuficiente;
				
				}
				else if (usarLimite == 'N') {
					System.out.println("Transação cancelada.");
				}
				
				else {
					System.out.println("Opção inválida, cancelando transação.");
				}
				
		}
		else {
		this.saldo -= valorSaque;
		System.out.println("Operação realizada com sucesso.");
		}
	}
	
	public void limiteEmpresarial (double valorLimiteEmpresarial) {
		if(valorLimiteEmpresarial <= 0) {
			System.out.println("Operação inválida.");
		}
		
		else if(valorLimiteEmpresarial > limiteEmpresarial) {
			System.out.println("Operação inválida.\nLimite Empresarial: R$"+limiteEmpresarial);
		}
		
		else {
			limiteEmpresarial -= valorLimiteEmpresarial;
		}
		
		
	}
}