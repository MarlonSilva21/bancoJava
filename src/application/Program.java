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

	public static void MenuPrincipal() {

		Scanner leia = new Scanner(System.in);
		double saldo = 0;
		int x = 0, diaHj = 0, dataAniversario = 30;
		char opcao;
		double valor = 0.0;
		char continua;
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

			System.out.println("\nOlá! Bem vinde a conta poupança! ");

			ContaPoupanca cp1 = new ContaPoupanca(numeroConta, dataAniversario);

			System.out.println("Número da sua conta-poupança: " + cp1.getNumeroConta());
			System.out.println("Saldo atual da conta é de: " + cp1.getSaldo());
			System.out.println("O dia de aniversario da conta é: " + cp1.getDiaAniversarioPoupanca());

			while (x < 5) {
				x++;
				System.out.println("Transação " + x);
				System.out.println("Você deseja [C] creditar ou [D] debitar um valor ? ");
				opcao = leia.next().toUpperCase().charAt(0);
				if (opcao == 'C') {

					System.out.println("Qual o valor de crédito: ");
					valor = leia.nextDouble();
					cp1.deposito(valor);
					System.out.println("Novo saldo é de: " + cp1.getSaldo());
				} else if (opcao == 'D') {
					if (cp1.getSaldo() <= 0) {
						System.out.println("Conta sem Saldo");
					} else {
						System.out.println("Qual o valor de Débito: ");
						valor = leia.nextDouble();
						cp1.saque(valor);
						while (valor > cp1.getSaldo()) {
							System.out.println("Valor acima do saldo, digite novamente");
							valor = leia.nextDouble();
							cp1.deposito(valor);
							System.out.println("Saldo atual: " + cp1.getSaldo());
						}
						System.out.println("Novo saldo é de: " + cp1.getSaldo());

					}
				}
			//	continuar transacoes ou sair do for
				do {
					System.out.println();
					cp1.getSaldo();
					System.out.print("Deseja continuar? [S/N]: ");
					continua = leia.next().toUpperCase().charAt(0);
					
					if(continua == 'S') {
						continue;
					}
					else if (continua == 'N') {
						x = 11;
						break;
					}
					
					if (continua != 'S' || continua != 'N') {
						System.out.println("Opção inválida");
					}
					
				}while(continua != 'S' && continua != 'N');
		
			

			}
			System.out.println("Digite o dia de hoje: ");
			diaHj = leia.nextInt();
			if (diaHj == dataAniversario) {
				cp1.poupanca(dataAniversario);
				System.out.println("Número da conta: " + cp1.getNumeroConta());

			}
			System.out.println("Hoje é o dia de aniversário da sua conta\n Seu saldo terá um ajuste 5%\n Seu saldo final é de: " + cp1.getSaldo());
			
			MenuPrincipal();
			
		}

	}
//		else if (escolhaMenu == 2) {
//			
//			System.out.println("Corrente");
//			ContaCorrente conta1 = new ContaCorrente(numeroConta);
//			Tela2("");
//		} else if (escolhaMenu == 3) {
//			System.out.println("Especial");
//			ContaEspecial conta1 = new ContaEspecial(numeroConta, 1000.0);
//			Tela2("3 - LIMITE\n");
//		} else if (escolhaMenu == 4) {
//			System.out.println("Empresarial");
//			ContaEmpresarial conta1 = new ContaEmpresarial(numeroConta, 10000);
//			System.out.println(conta1.getSaldo());
//			Tela2("3 - EMPRÉSTIMO\n");
//		} else if (escolhaMenu == 5) {
//			System.out.println("Estudantil");
//			ContaEstudantil conta1 = new ContaEstudantil(numeroConta, 5000);
//			Tela2("3 - LIMITE ESTUDANTIL\n");
//		} else if (escolhaMenu == 6) {
//			System.out.println("SAIR");
//		} else {
//			System.out.println("Opção inválida.\n");
//			MenuPrincipal();
//		}
//
//		leia.close();
//	}
//
//	private static Object escolhaMenu() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public static void Tela2(String x) {
//
//		Scanner leia = new Scanner(System.in);
//		int i = 0;
//		int operacaoMenu;
//		do {
//
//			System.out.println("-------BANZZAI------");
//			System.out.println("--時間は私たちの保証です--");
//
//			System.out.println();
//			System.out.println("===================");
//			System.out.println("1 - SAQUE");
//			System.out.println("2 - DEPÓSITO");
//			System.out.print(x);
//			System.out.println("0 - VOLTAR AO MENU");
//			System.out.println("===================");
//			System.out.println();
//
//			System.out.println("Selecione uma operação.");
//			operacaoMenu = leia.nextInt();
//
//			if (operacaoMenu == 1) {
//
//			}
//
//			i++;
//
//		} while (i < 10);
//		leia.close();

}
