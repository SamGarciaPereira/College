package br.com.unicuritiba.jokenpo;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Jogada[] jogadas = new Jogada[3];
		
		jogadas[0] = new Jogada("Pedra", 1);
		jogadas[1] = new Jogada("Papel", 2);
		jogadas[2] = new Jogada("Tesoura", 3);
		
		System.out.println("Bem vindo ao JokenPo");
		System.out.println("");
		System.out.println("Digite a jogada que deseja: ");
		System.out.println("");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		
		int jjp = input.nextInt();
		int cjp = new Random().nextInt(3);
		
		Jogada jc = jogadas [cjp];
		
		if(jjp == jc.getValor()){
			//empate
			System.out.println("Empate!");
		}else if(jjp != 3 && jc.getValor() != 3) {
			if(jjp > jc.getValor()) {
				//jogador ganhou
				System.out.println("Jogador ganhou!");
			}
			else {
				//pc ganhou
				System.out.println("Computador ganhou");
			}
		}
	}
}


