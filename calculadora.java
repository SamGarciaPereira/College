package samukacalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Bem vindo à calculadora inteligente! Escolha a operação desejada e insira dois números e lhe darei o resultado!\n");
		
		System.out.println("Escolha a operação desejada: \n1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
		int operacao = input.nextInt();
		
		while(operacao < 1 || operacao > 4) {
			System.out.println("Operação inválida, insira um número entre 1 e 4 e tente novamente: ");
			operacao = input.nextInt();
		}
		
		System.out.println("Insira o número 1: ");
		double n1 = input.nextDouble();
		System.out.println("Insira o número 2: ");
		double n2 = input.nextDouble();
		input.close();
		
		double resultado = executarOperacoes(n1, n2, operacao);
		System.out.println("O resultado da operação é: " + resultado);
	}
	
	public static double executarOperacoes(double n1, double n2, int operacao) {
		Scanner input = new Scanner(System.in);
		
		double resultado = 0.0;
		
		switch(operacao) {
			
		case 1:
			resultado = n1 + n2;
			break;
		case 2: 
			resultado = n1 - n2;
			break;
		case 3: 
			resultado = n1 * n2;
			break;
		case 4: 
			resultado = n1 / n2;
			break;
		default:
			break;
		}
		input.close();
		return resultado;
	}
}
