package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaCorrente;
import entities.ContaEmpresarial;
import entities.ContaEspecial;
import entities.ContaEstudantil;
import entities.ContaPoupanca;

public class Program {
	
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
		
		ContaPoupanca poupanca = new ContaPoupanca(numeroConta, 15); 
		ContaCorrente corrente = new ContaCorrente(numeroConta);
		ContaEspecial especial = new ContaEspecial(numeroConta, 1000.0);
		ContaEmpresarial empresarial = new ContaEmpresarial(numeroConta, 10000.0);
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
		
		
		
		
		
		
		
		
		
		
		/*if (escolhaMenu == 1) {
			System.out.println("\n------POUPANÇA------");
			
			
		}
		else if (escolhaMenu == 2) {
			System.out.println("Corrente");
			
			//conta1.deposito(50.0); deposito para testar taloes
			System.out.println(conta1.getSaldo());
			conta1.oferecerTalao();
			
		}
		else if (escolhaMenu == 3) {
			System.out.println("Especial");
			
			
		}
		else if (escolhaMenu == 4) {
			System.out.println("Empresarial");
			
			System.out.println(conta1.getSaldo());
			
		}
		else if (escolhaMenu == 5) {
			System.out.println("Estudantil");
			
			
		}
		else if (escolhaMenu == 6) {
			System.out.println("SAIR");
		}
		else {
			System.out.println("Opção inválida.\n");
			MenuPrincipal();
		}
		
		
		leia.close();
	}
	
	public static void Tela2 (String x) {
		
		Scanner leia = new Scanner(System.in);
		int i = 0;
		int operacaoMenu;
		do{
			
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
			
			System.out.println("Selecione uma operação.");
			operacaoMenu = leia.nextInt();
		
		if(operacaoMenu == 1) {
			System.out.println("Digite o valor a ser sacado: R$ ");
			double valorSaque = leia.nextDouble();
			//conta1.saque(valorSaque);
		}
		
			i++;
			
		}while( i < 10);
		leia.close();

	}*/
	

}