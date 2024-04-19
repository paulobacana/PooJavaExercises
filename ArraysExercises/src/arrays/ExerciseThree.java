package arrays;
import java.util.Scanner;

public class ExerciseThree {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int [] arr = {1, 5, 6, 8, 2, 9};
		int num;
		
		System.out.println("digite um número para verificar se está no array:");	
		num = scan.nextInt();
		
		for(int i = 0; i<arr.length; i++) {
			
			if (num == arr[i]) {
				System.out.println(" existe no array");
			} 
				System.out.println( "não existe no array");
		};
	
		
	}

}
