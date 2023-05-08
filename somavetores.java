package br.com.unicuritiba;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n[] = new int[5];
		
		System.out.println("SOMADOR DE NÚMEROS\n");
		
		for(int i = 0; i < n.length; i++) {
			System.out.println("Insira o " + (i+1) + "º número: ");
			n[i] = input.nextInt();		
		}	
		
		int soma = 0;
		
		for (int i = 0; i < n.length; i++) {
            soma += n[i];       
        }
		
		System.out.println("A soma dos números é: " + soma);
		
		System.out.println("Os números digitados foram:");
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }

        input.close();
	}
}
