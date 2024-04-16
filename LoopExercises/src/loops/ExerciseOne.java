package loops;
import java.util.Scanner;

public class ExerciseOne {
	
	public static void main(String [] args) {
		
		/*1. Faça um programa que peça uma nota, entre zero e dez. Mostre uma 
		 * 	 mensagem caso o valor seja inválido e continue pedindo até que o 
		 *   usuário informe um valor válido.*/
		
		Scanner scan = new Scanner(System.in);
		int num;
		
		
		do {
			System.out.println("Insira uma nota de zero a dez:");
			num = scan.nextInt();
			if (num > 10 || num < 0) {
				System.out.println("Número inválido");
			}
			else {
				System.out.println("Fim do programa");
			}
		}
		while(num > 10 || num < 0);
	}

}
