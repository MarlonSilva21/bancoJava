package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaCorrente;
import entities.ContaEmpresarial;
import entities.ContaEspecial;
import entities.ContaEstudantil;
import entities.ContaPoupanca;

public class ProgramEmp {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		MenuPrincipal();
	}
	
	public static void MenuPrincipal () {
		
		Scanner leia = new Scanner(System.in);
		int escolhaContaMenu;
		
		
		System.out.println("------BANZZAI------");
		System.out.println("--時間は私たちの保証です--");
		
		System.out.println();
		System.out.println("===================");
		System.out.println("1 - CONTA POUPANÇA");
		System.out.println("2 - CONTA CORRENTE");
		System.out.println("3 - CONTA ESPECIAL");
		System.out.println("4 - CONTA EMPRESARIAL");
		System.out.println("5 - CONTA ESTUDANTIL");
		System.out.println("6 - SAIR");
		System.out.println("==================="); 
		System.out.println();
		System.out.print("Selecione uma operação: ");
		int escolhaMenu = leia.nextInt();
		System.out.println();
		System.out.print("Digite o número da conta: ");
		int numeroConta = leia.nextInt();
		
		ContaPoupanca poupanca = new ContaPoupanca(numeroConta, 15); 
		ContaCorrente corrente = new ContaCorrente(numeroConta);
		ContaEspecial especial = new ContaEspecial(numeroConta, 1000.0);
		
		ContaEstudantil estudantil = new ContaEstudantil(numeroConta, 5000.0);
		
		switch(escolhaMenu) {
		case 1: //ContaPoupanca();
			System.out.println("\n------POUPANÇA------");
			
			
			break;
		case 2:
			System.out.println("Corrente");
			//ContaCorrente
			break;
		case 3:
			System.out.println("Especial");
			//ContaEspecial
			break;
		case 4:
			ContaEmpresarial empresarial = new ContaEmpresarial(numeroConta, 10000.0);
			int i =0;
			char continua;
			for (i=1;i<=10;i++) {
			ContaMenu("EMPRESARIAL","3 - EMPRÉSTIMO\n");
			System.out.println("Selecione uma operação: ");
			escolhaContaMenu = leia.nextInt();
				if(escolhaContaMenu == 1) {
					System.out.println("Valor do saque: R$");
					int valorSaqueEmp = leia.nextInt();
					empresarial.saque(valorSaqueEmp);
					System.out.println("\nSaldo: R$"+empresarial.getSaldo());
					System.out.println("Limite Empresarial: R$"+empresarial.getLimiteEmpresarial()+"\n");
				}
				else if (escolhaContaMenu == 2) {
					System.out.println("Valor do depósito: R$");
					int valorDepositoEmp = leia.nextInt();
					empresarial.deposito(valorDepositoEmp);
					System.out.println("\nSaldo: R$"+empresarial.getSaldo());
					System.out.println("Limite Empresarial: R$"+empresarial.getLimiteEmpresarial());
				}
				else if (escolhaContaMenu == 3) {
					System.out.println("Valor do empréstimo: R$");
					int valorEmprestimoEmp = leia.nextInt();
					empresarial.limiteEmpresarial(valorEmprestimoEmp);
					System.out.println("\nSaldo: R$"+empresarial.getSaldo());
					System.out.println("Limite Empresarial: R$"+empresarial.getLimiteEmpresarial());
				}
				
				do {
					System.out.println();
					System.out.print("Deseja continuar? [S/N]: ");
					continua = leia.next().toUpperCase().charAt(0);
					
					if(continua == 'S') {
						continue;
					}
					else if (continua == 'N') {
						i = 11;
						break;
					}
					
					if (continua != 'S' || continua != 'N') {
						System.out.println("Opção inválida");
					}
					
				}while(continua != 'S' && continua != 'N');
			}	
			//ContaEmpresarial
			MenuPrincipal();
			break;
		case 5:
			System.out.println("Estudantil");
			//ContaEstudantil
			break;
		case 6:
			System.out.println("SAIR");
			break;
		default: 
			System.out.println("Opção inválida.\n");
			MenuPrincipal();
		}
		leia.close();
	}

	public static void ContaMenu (String tipoConta, String x) {
		
		

			
			System.out.println("-------BANZZAI------");
			System.out.println("--時間は私たちの保証です--");
			
			
			System.out.println();
			System.out.println("===================");
			System.out.println("1 - SAQUE");
			System.out.println("2 - DEPÓSITO");
			System.out.print(x);
			System.out.println("0 - VOLTAR AO MENU");
			System.out.println("===================");
			System.out.println();
			
			
		
		
	}
	

}