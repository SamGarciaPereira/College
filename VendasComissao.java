package br.com.unicuritiba;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int soma = 0; double vendas[] = new double[5];
		
		System.out.println("Insira os valores de cada dia de trabalho e descubra sua comissão.\n");
		
		for(int i = 0; i < vendas.length; i++) {
			System.out.println("Insira o valor obtido na " + (i+2) + "ª feira: ");
			vendas[i] = input.nextDouble();
			soma += vendas[i];
		}
		
		System.out.println("Insira o valor da comissão em porcentagem: ");
		double comissao = input.nextDouble();
		
		while(true) {
			if(comissao < 0 || comissao > 100) {
				System.out.println("Valor de comissão inválido. Digite uma porcentagem entre 0 e 100: ");
				comissao = input.nextDouble();	
				}else {
					break;
			}
		}
		
		double resultados = (soma * (comissao/100));
		
		if(resultados > 100) {
			System.out.println("O valor final de sua comissão é R$: " + resultados + ".");
		} else {
			System.out.println("O valor final de sua comissão é R$ 100,00.");
		}
		input.close();
	}
}
