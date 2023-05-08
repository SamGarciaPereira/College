package br.com.unicuritiba;

import java.util.Scanner;

public class MultiplicaPor5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int n[] = new int[10];
		int nx5[] = new int[10];
		
		System.out.println("INSIRA 10 NÚMEROS E DESCUBRA SEU VALOR MULTIPLICADO POR 5.\n");
		
		for(int i = 0; i < n.length; i++) {
			System.out.println("Insira o " + (i+1) + "º número: ");
			n[i] = input.nextInt();
		}
		
		for(int i = 0; i < nx5.length; i++) {
			nx5[i] = n[i] * 5; 
		}
		
		for(int i = 0; i < n.length; i++) {
			System.out.println(n[i] + " - " + nx5[i]);
		}
		
		input.close();		
	}
	
}
