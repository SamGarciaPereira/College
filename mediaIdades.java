package br.com.unicuritiba;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int soma  = 0, mulheresacimade20 = 0, i = 1;
		
		while (i <= 10) {
			System.out.println("Insira a idade da pessoa " + i + ": ");
			int idades = input.nextInt();
			
			System.out.println("Insira o sexo da pessoa " + i + " (F/M): ");
			String sexo = input.next();
			
			soma += idades;
			
			if(sexo.equals("F") & idades > 20 || (sexo.equals("f") & idades > 20)) {
				mulheresacimade20 += 1;
			}
			i++;
		}
		
		float media = soma/10;	
		
		System.out.println("A média das idades das pessoas inseridas é " + media + " anos. Essa é a contagem das mulheres acima de 20 anos: " + mulheresacimade20);
			
		input.close();
	}

}
