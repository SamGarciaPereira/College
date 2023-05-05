package br.com.unicuritiba;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String[] sucos = {"Laranja", "Limão", "Abacaxi", "Morango", "Uva"};
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escolha um suco (0 a 4):");
        for (int i = 0; i < 5; i++) {
            System.out.println(i + ". " + sucos[i]);
        }
        
        int escolha = scanner.nextInt();
        if (escolha < 0 || escolha > 4) {
            System.out.println("Escolha inválida.");
        } else {
            System.out.println("Você escolheu o suco de " + sucos[escolha] + ".");
        }
    }
}
