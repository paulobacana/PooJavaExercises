package arrays;
import java.util.Scanner;
import java.util.Arrays;


public class ExerciseTwo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] numbers = new int[5];
		
		System.out.println("Digite 5 números:");
		
		
		
		for(int i = 0; i< numbers.length; i++) {
			numbers[i] = scan.nextInt();
		}
		
		Arrays.sort(numbers);
		
		System.out.println("Números digitados:");
		System.out.println(Arrays.toString(numbers));
	
		
			

	}

}
