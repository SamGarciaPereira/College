 import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

		Scanner input = new Scanner(System.in);
		
		int n_carros = 10, primeiro = 1000, segundo = 1000, terceiro = 1000, soma = 0;
		int [] voltas = new int [n_carros]; 
		
		for(int i = 0; i < n_carros; i++) {
			System.out.println("Insira o tempo de volta do carro: ");
			int tempo = input.nextInt();
			voltas[i] = tempo;
		}
		
		// volta mais rápida
		for(int i = 0; i < n_carros; i++) {
			if(primeiro > voltas[i]) {
				primeiro = voltas[i];
				}			
			}
		// segunda volta mais rápida 
		for(int i = 0; i < n_carros; i++) {
			if(voltas[i] > primeiro & voltas[i] < segundo) {
				segundo = voltas[i];
			}
		}
		// terceira volta mais rápida
		for(int i = 0; i < n_carros; i++) {
			if(voltas[i] > segundo & voltas[i] < terceiro) {
				terceiro = voltas[i];
			}
		}
		// media das voltas
		for(int i = 0; i < n_carros; i++) {
			soma += voltas[i];
		}
		
		for(int i = 0; i < n_carros; i++) {
			 
				
			
		}
		
		System.out.println("A volta mais rápida foi: " + primeiro);
		System.out.println("A segunda volta mais rápida foi: " + segundo);
		System.out.println("A terceira volta mais rápida foi: " + terceiro);
		System.out.println("A média de velocidade da pista é: " + soma/n_carros);
		System.out.println();
	}

}
    

