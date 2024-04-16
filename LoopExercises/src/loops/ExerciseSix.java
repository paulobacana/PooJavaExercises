package loops;

public class ExerciseSix {
	
	public static void main(String[] args) {
		
		/*6. Faça um programa que imprima na tela os números de 1 a 20, 
		 *   um abaixo do outro. Depois modifique o programa para que ele 
		 *   mostre os números um ao lado do outro.*/
		
		for (int i = 1; i<=20; i++) {
			
			String s = String.format("%d, ", i);
			System.out.print(s);
		}
	}

}
