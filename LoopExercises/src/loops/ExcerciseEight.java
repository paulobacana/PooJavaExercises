package loops;
import java.util.Scanner;
import java.util.ArrayList;

public class ExcerciseEight {
	
	public static void main(String [] args) {
		
		/*8. Faça um programa que leia 5 números e informe a soma e a média dos números.*/
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int soma = 0; 
		double media = 0;
		
		System.out.println("Insira 5 números: ");
		for (int i = 0; i<5; i++) {
			numbers.add(scan.nextInt());
		}
		
		for(int num: numbers) {
			soma += num;
			media = soma / 5;
		}
		
		System.out.println("A soma desses números é = " + soma);
		System.out.println("A sua média é: " + media);
		
	}

}
