package application;

import java.util.Scanner;

import entities.ContaEspecial;

public class TesteContaE {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		ContaEspecial conta = new ContaEspecial(808,1000);
		
		char op = 'N';
		final int LIMITE = 10;
		int contador =1;
		
		do {
		System.out.println("Operação N :  "+contador);	
		System.out.println("Informe valor de Saque : ");
		
		double valorSaque = read.nextDouble();
		conta.saque(valorSaque);
		System.out.println("Saldo  "+conta.getSaldo());
		System.out.println("Limite  " +conta.getLimiteEspecial());
		
		
		System.out.println("Deseja continuar S/N ?");
		op = read.next().toUpperCase().charAt(0);
		contador++;
		System.out.println("\n Limite de transações atingido!");
		}while (op == 'S' && contador <= LIMITE);
			
		

	}

}
