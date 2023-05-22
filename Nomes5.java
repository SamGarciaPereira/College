package br.com.unicuritiba;

import java.util.Scanner;

public class Nomes5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String nomes[] = new String[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Usuário 1, insira o nome da pessoa " + (i+1) + ": ");
			nomes[i] = input.nextLine();				
		}
		
		System.out.println("Usuário 2, insira qualquer nome: ");
		String nomeInserido = input.nextLine();
		
		boolean encontrado = false;
		
		for(String nome : nomes) {
			if(nome.equalsIgnoreCase(nomeInserido)) {
				encontrado = true;
				break;
			}
		}
		
		if(encontrado) {
			System.out.println("Encontrei!");
		}else {
			System.out.println("Não encontrei!");
		}
		input.close();
	}
}
