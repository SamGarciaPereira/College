//Este algoritimo solicita ao usuário entrar com o valor do raio, e no final imprime o comprimento da circunferência.

import java.util.Scanner;

public class compcircunferencia {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do raio: ");
		
		float raio = scanner.nextFloat();
		
		double comp_circunferencia = 2 * (3.14)  * raio;
		
		System.out.print("O comprimento desta circunferência é " + comp_circunferencia);
		
    }
}
