package loops;
import java.util.Scanner;
import java.util.ArrayList;

public class ExerciseSeven {

	public static void main(String[] args) {
		
		/*7. Faça um programa que leia 5 números e informe o maior número.*/
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int max = Integer.MIN_VALUE;
				
		System.out.println("Insira 5 números: ");
		for (int i = 0; i<5; i++) {
			numbers.add(scan.nextInt());
		}
		
		for (int num : numbers) {
			if (num > max) {
				max = num;
			}
		}
		
		System.out.println("o maior valor é: " + max);

	}

}
