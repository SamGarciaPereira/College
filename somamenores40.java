//Esse algoritimo solicita ao usuário uma inserção de 10 números que serão somados, mas a condição é que apenas os números menores que 40 serão somados. No final do código o programa imprime a soma total dos números inseridos.

import java.util.Scanner;
public class somamenores40 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int soma = 0, i = 1;

        System.out.println("Insira 10 números e eu calcularei sua soma. obs: somente números menores que 40 serão somados.");

        while(i <= 10){
            System.out.println("Insira o " + i + "º número: ");
            int numero = input.nextInt();
            i++;
            if(numero < 40){
                soma += numero;
            }
        }
        System.out.println("A soma dos números inseridos é: " + soma);
    }
}
