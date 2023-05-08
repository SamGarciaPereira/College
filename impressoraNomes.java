package br.com.unicuritiba;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		String nome[] = new String[5];
		
		System.out.println("IMPRESSORA DE NOMES");
		
		for(int i = 0; i < nome.length; i++) {
			System.out.println("Insira o " + (i+1) + "º nome: ");
			nome[i] = input.nextLine();
		}
		
		System.out.println("Os nomes digitados foram:");
		for(int i = 0; i < nome.length; i++){
			System.out.println(nome[i]);
		}
		
		input.close();

	}

}
