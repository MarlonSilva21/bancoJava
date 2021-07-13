package entities;

import java.util.Scanner;

public class ContaCorrente extends Conta {
	
	public static final double TAXA_TALAO = 30.00;
	
	private int qtdTalao;
	
	public ContaCorrente(int numeroConta) {
		super(numeroConta);
		
	}

	public int getQtdTalao() {
		return qtdTalao;
	}

	public void setQtdTalao(int qtdTalao) {
		this.qtdTalao = qtdTalao;
	}

	public void oferecerTalao() {
		
		Scanner sc = new Scanner(System.in);
		char desejaTalao, confirma;
		double debitoTalao;
		
		if (saldo >= 30) {
			
			do {
				System.out.println();
				System.out.println("Deseja adquirir talões de cheque? ");
				System.out.print("(Valor de R$30.00 cada talão, limitado a 3 talões) [S/N]: ");
				desejaTalao = sc.next().toUpperCase().charAt(0);
				
				if (desejaTalao != 'S' && desejaTalao != 'N') {
					System.out.println("Opção inválida!");
					
				}
			} while(desejaTalao != 'S' && desejaTalao != 'N');
			
			
			if (desejaTalao == 'S') {
				do{
					
					System.out.println();
					System.out.print("Informe a quantidade de talões desejada: ");
				
					qtdTalao = sc.nextInt();					
				
					if (qtdTalao < 1 || qtdTalao > 3) {
						System.out.println("Quantidade inválida!");
					}
					
					debitoTalao = qtdTalao * TAXA_TALAO;
					
					if (debitoTalao >= saldo && qtdTalao >= 1 && qtdTalao <= 3) {
						System.out.println("Saldo insuficiente para compra!");
						System.out.printf("Valor dos talões selecionados = R$%.2f\n", debitoTalao);
						System.out.printf("Saldo = R$%.2f\n", saldo);
						
					}
						
				}while((qtdTalao < 1 || qtdTalao > 3) || (debitoTalao > saldo));
				
				do {
					System.out.println();
					System.out.println("Quantidade de talões: " + qtdTalao);
						
					System.out.printf("Valor a ser debitado: R$ %.2f\n", debitoTalao);
					System.out.print("Confirma? [S/N]: ");
					confirma = sc.next().toUpperCase().charAt(0);
					
					if (confirma != 'S' && confirma != 'N') {
						System.out.println("Opção inválida!");
						
					}
				} while(confirma != 'S' && confirma != 'N');
				
				if (confirma == 'S') {
					saldo -= debitoTalao; 
					System.out.println();
					System.out.println("Operação realizada com sucesso!");
					System.out.printf("Seu novo saldo: R$ %.2f\n", getSaldo());
					System.out.println("Obrigado por usar os nossos serviços!");
				}
				else if (confirma == 'N') {
					System.out.println();
					System.out.println("Operação cancelada!");
					System.out.println("Obrigado por usar os nossos serviços!");
				}
			}	
			else if (desejaTalao == 'N') {
				System.out.println();
				System.out.println("Obrigado por usar os nossos serviços!");
			}
			
		sc.close();
		
		}
	}
}