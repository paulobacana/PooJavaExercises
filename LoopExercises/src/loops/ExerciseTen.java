package loops;
import java.util.Scanner;

public class ExerciseTen {

	public static void main(String[] args) {
		
		/*10.Faça um programa que receba dois 
		 *   números inteiros e gere os números 
		 *   inteiros que estão no intervalo compreendido por eles.*/
		
		Scanner scan = new Scanner(System.in);
		int n1, n2;
		
		System.out.print("insira o primeiro número: ");
		n1 = scan.nextInt();
		
		System.out.print("insira o Segundo número: ");
		n2 = scan.nextInt();
		
		System.out.println("Os números entre o primeiro e segundo número são: ");
		for (int i = n1; i<=n2; i++) {
			
			System.out.println(i);
		}

	}

}
