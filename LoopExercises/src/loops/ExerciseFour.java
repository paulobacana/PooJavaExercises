package loops;
import java.util.Scanner;

public class ExerciseFour {

	public static void main(String[] args) {
		
		/*4. Supondo que a população de um país A seja da ordem de 80000 habitantes com uma 
		 * 	 taxa anual de crescimento de 3% e que a população de B seja 200000 habitantes com 
		 * 	 uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o número 
		 * 	 de anos necessários para que a população do país A ultrapasse ou 
		 * 	 iguale a população do país B, mantidas as taxas de crescimento.*/
	
		
		int A = 80000;
		int B = 200000;
		int ano = 0;
		double totalA, totalB;
		
		 System.out.println("Ano: " + ano);
		 System.out.println("população país A: " + A + " mil");
		 System.out.println("população país B: " + B + " mil");
		
		while (A <= B) {
		 ano++;
		 totalA = Integer.parseInt(String.valueOf(A)) * 1.03;
		 totalB = Integer.parseInt(String.valueOf(B)) * 1.015;
		 
		 A = (int)totalA;
		 B = (int)totalB;
		 
		 String a = String.format("%,d mil", A);
		 String b = String.format("%,d mil", B);
		 
		 System.out.println("Ano: " + ano);
		 System.out.println("população país A: " + a);
		 System.out.println("população país B: " + b);
		}
		

	}

}
