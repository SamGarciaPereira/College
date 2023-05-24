package br.com.unicuritiba;

import java.util.Scanner;

public class Vetores4equals {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int vetor1[] = new int[4];
		int vetor2[] = new int[4];
		
		for(int i = 0; i < 4; i++) {
			System.out.println("Insira o " + (i+1) + "º valor do vetor 1: ");
			vetor1[i] = input.nextInt();
			System.out.println("Insira o " + (i+1) + "º valor do vetor 2: ");
			vetor2[i] = input.nextInt();
		}
		
		for(int i = 0; i < 1; i++){
			if(vetor1[i] != vetor2[i]) {
				System.out.println("Os valores dos vetores são diferentes.");
			}else{
				System.out.println("Os valores dos vetores são iguais.");
			}
		}
		input.close();
	}
}
