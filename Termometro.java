package br.com.unicuritiba;

import java.util.Scanner;

public class Termometro {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Insira a temperatura em Celsius: ");
		double c = input.nextFloat();
		
		double f = (c * 1.8 + 32);
		double k = (c + 273.15);
		double re = (c * 0.8);
		double ra = (c * 1.8 + 32 + 459.67);
		
		System.out.println("Digite o número e escolha a escala de temperatura: \n1 - Fahrenheit\n2 - Kelvin\n3 - Réaumur\n4 - Rankine");
		int escala = input.nextInt();
		
		if(escala > 4) {
			System.out.println("Insira um número de 1 a 4 para escolher a escala desejada e tente novamente: ");
			escala = input.nextInt();
			
			switch (escala) {
			case 1: System.out.println("A temperatura inserida em Celsius torna-se " + f + " graus na escala Fahrenheit.");
			break;
			
			case 2: System.out.println("A temperatura inserida em Celsius torna-se" + k + " graus na escala Kelvin.");
			break;
			
			case 3: System.out.println("A temperatura inserida em Celsius torna-se " + re + " graus na escala Réaumur.");
			break;
			
			case 4: System.out.println("A temperatura inserida em Celsius torna-se " + ra + " graus na escala Rankine.");
			break;
			}
		} else {
			switch (escala) {
			case 1: System.out.println("A temperatura inserida em Celsius torna-se " + f + " graus na escala Fahrenheit.");
			break;
			
			case 2: System.out.println("A temperatura inserida em Celsius torna-se" + k + " graus na escala Kelvin.");
			break;
			
			case 3: System.out.println("A temperatura inserida em Celsius torna-se " + re + " graus na escala Réaumur.");
			break;
			
			case 4: System.out.println("A temperatura inserida em Celsius torna-se " + ra + " graus na escala Rankine.");
			break;
			}
		}
		
		input.close();
	}

}
