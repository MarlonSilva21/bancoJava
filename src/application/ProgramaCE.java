package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaCorrente;
import entities.ContaEmpresarial;
import entities.ContaEspecial;
import entities.ContaEstudantil;
import entities.ContaPoupanca;

public class ProgramaCE {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		MenuPrincipal();
		
	}
	
	public static void MenuPrincipal () {
		
		Scanner leia = new Scanner(System.in);
		
		
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
		
		switch(escolhaMenu) {
		case 1: //ContaPoupanca();
			
			break;
		case 2:
			
			char continua;
			
			ContaCorrente corrente = new ContaCorrente(numeroConta);
			
			for (int i = 0 ; i < 10; i++) {
				ContaMenu("CONTA-CORRENTE", "", corrente.getSaldo());
				
				System.out.print("Selecione uma operação: ");
				int operacaoMenu = leia.nextInt();
			
				switch(operacaoMenu) {
				
				//opcao saque
				case 1: 
					System.out.print("Digite o valor a ser sacado: R$ ");
					double valorSaque = leia.nextDouble();
					corrente.saque(valorSaque);
					break;
				
				//opcao deposito
				case 2: 
					System.out.print("Digite o valor a ser depositado: R$ ");
					double valorDeposito = leia.nextDouble();
					corrente.deposito(valorDeposito);
					break;
					
				default: 
					System.out.println("Opção inválida.\n");
				}
				
				//continuar transacoes ou sair do for
				do {
					System.out.println();
					System.out.print("Deseja continuar? [S/N]: ");
					continua = leia.next().toUpperCase().charAt(0);
					
					if(continua == 'S') {
						continue;
					}
					else if (continua == 'N') {
						break;
					}
					
					if (continua != 'S' || continua != 'N') {
						System.out.println("Opção inválida");
					}
					
				}while(continua != 'S' && continua != 'N');
			}
			
			//corrente.oferecerTalao();
			MenuPrincipal();
			break;
		case 3:
			
			ContaEspecial especial = new ContaEspecial(numeroConta, 1000.0);
			ContaMenu("CONTA ESPECIAL", "3 - LIMITE", especial.getSaldo());
			
			System.out.println("Especial");
			for (int i = 0 ; i < 10; i++) {
				ContaMenu("CONTA ESPECIAL", "", especial.getSaldo());
				
				System.out.print("Selecione uma operação: ");
				int operacaoMenu = leia.nextInt();
			
				switch(operacaoMenu) {
				
				//opcao saque
				case 1: 
					System.out.print("Digite o valor a ser sacado: R$ ");
					double valorSaque = leia.nextDouble();
					especial.saque(valorSaque);
					System.out.println("Saldo  "+especial.getSaldo());
					System.out.println("Limite  " +especial.getLimiteEspecial());
					
					break;
				
					//opcao deposito
				case 2: 
					System.out.print("Digite o valor a ser depositado: R$ ");
					double valorDeposito = leia.nextDouble();
					especial.deposito(valorDeposito);
					
					System.out.println("Saldo  "+especial.getSaldo());
					System.out.println("Limite  " +especial.getLimiteEspecial());
					break;
					
				default: 
					System.out.println("Opção inválida.\n");
				}
				
				//continuar transacoes ou sair do for
				do {
					System.out.println();
					System.out.print("Deseja continuar? [S/N]: ");
					continua = leia.next().toUpperCase().charAt(0);
					
					if(continua == 'S') {
						continue;
					}
					else if (continua == 'N') {
						break;
					}
					
					if (continua != 'S' || continua != 'N') {
						System.out.println("Opção inválida");
					}
					
				}while(continua != 'S' && continua != 'N');
			}
			
			
			MenuPrincipal();
			
			
			
			//ContaEspecial
			break;
		case 4:
			System.out.println("Empresarial");
			//ContaEmpresarial
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
		
	}
	
	public static void ContaMenu (String tipoConta, String x, double saldo) {
		
		
		
		System.out.println();
		System.out.println("-------BANZZAI------");
		System.out.println("--時間は私たちの保証です--");
		System.out.println();
		System.out.println(tipoConta);
		System.out.println();
		System.out.printf("SALDO: R$ %.2f\n", saldo);
		System.out.println("===================");
		System.out.println("1 - SAQUE");
		System.out.println("2 - DEPÓSITO");
		System.out.print(x);
		System.out.println("0 - VOLTAR AO MENU");
		System.out.println("===================");
		System.out.println();
		
		
	}
		
}	
