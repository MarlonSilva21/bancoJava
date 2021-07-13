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
		
		Scanner read = new Scanner (System.in);
		ContaEspecial conta = new ContaEspecial(808,1.000);
		
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
		
		if (escolhaMenu == 1) {
			System.out.println("\n------POUPANÇA------");
			ContaPoupanca conta1 = new ContaPoupanca(numeroConta, 15); 
			Tela2("");
		}
		else if (escolhaMenu == 2) {
			System.out.println("Corrente");
			ContaCorrente conta1 = new ContaCorrente(numeroConta);
			Tela2("");
		}
		else if (escolhaMenu == 3) {
			System.out.println("Especial");
			ContaEspecial conta1 = new ContaEspecial(numeroConta, 1000.0);
			Tela2("3 - LIMITE\n");
		}
		else if (escolhaMenu == 4) {
			System.out.println("Empresarial");
			ContaEmpresarial conta1 = new ContaEmpresarial(numeroConta, 10000);
			System.out.println(conta1.getSaldo());
			Tela2("3 - EMPRÉSTIMO\n");
		}
		else if (escolhaMenu == 5) {
			System.out.println("Estudantil");
			ContaEstudantil conta1 = new ContaEstudantil(numeroConta, 5000);
			Tela2("3 - LIMITE ESTUDANTIL\n");
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

		}
		
			i++;
			
		}while( i < 10);
		leia.close();

	}

}