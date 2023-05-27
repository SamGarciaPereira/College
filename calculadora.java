package br.com.unicuritiba.calculadora;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira a opera��o desejada: ");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtra��o");
		System.out.println("3 - Multiplica��o");
		System.out.println("4 - Divis�o");
		
		int opcao = input.nextInt();
		
		while(true) {
			if(opcao > 4 || opcao < 1) {
				System.out.println("Op��o inv�lida, tente novamente e insira um n�mero de 1 a 4 para continuar: ");
				opcao = input.nextInt();			
			}else{
				break;
			}
		}
		
		System.out.println("Insira o operador 1: ");
		double o1 = input.nextDouble();
		
		System.out.println("Insira o operador 2: ");
		double o2 = input.nextDouble();
		
		
		switch(opcao) {
			case 1:
				double resultado = somar(o1, o2);
				verificaResultado(resultado);
				break;
			case 2:
				resultado = subtrair(o1, o2);
				verificaResultado(resultado);
				break;
			case 3: 
				resultado = multiplicar(o1, o2);
				verificaResultado(resultado);
				break;
			case 4:
				resultado = dividir(o1, o2);
				verificaResultado(resultado);
				break;
			default:
				break;
		}
		input.close();
	}
	private static double somar(double o1, double o2) {
		double resultado = o1 + o2;
		return resultado;
	}
	private static double subtrair(double o1, double o2){
		double resultado = o1 - o2;
		return resultado;
	}
	private static double multiplicar(double o1, double o2) {
		double resultado = o1 * o2;
		return resultado;
	}
	private static double dividir(double o1, double o2) {
		double resultado = o1 / o2;
		return resultado;
	}
	private static double verificaResultado(double resultado) {
		if(resultado < 300) {
			System.out.println("O resultado � " + resultado);
		}else {
			System.out.println("O resultado � maior que 300.");
		}
		return resultado;
	}
}

