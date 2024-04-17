package arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class ExcerciseOne {
	
	public static void main(String[] args) {
		
		/*Desenvolva um programa que realize a entrada de dados de 5 idades 
		  (inteiro positivo maior que 0). Utilize um vetor para armazenar todas 
		  as idades. Após a entrada de todos os valores realize as seguintes tarefas com o vetor:
		  Some todos os valores do vetor e apresente o resultado para o usuário;
		  Identifique a menor idade e a maior idade contida no vetor, e mostre os valores para o usuário;
		  Identifique a diferença de idade entre a menor idade e a maior idade;
		  Calcule e mostre para o usuário a idade média de todas as idades cadastradas no vetor.*/
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		int maior =0; 
		int menor = Integer.MAX_VALUE;
		int soma = 0;
		int diferenca = 0;
		int media =0;
		
		for(int i = 2; i<=6; i++) {
			System.out.print("insira o numero " + (i-1) + ": ");
			numbers.add(scan.nextInt());
		}
		
		for (int numeros: numbers) {
			if (numeros> maior) {
				maior = numeros;
			}
			if(numeros < menor) {
				menor = numeros;
			}
			
			soma += numeros;
			diferenca = maior - menor;
			media = soma /5;
		}
		
		System.out.println("A soma dos números é: " + soma);
		System.out.println("O maior número é: " + maior);
		System.out.println("O menor número é: " + menor);
		System.out.println("A diferença de idade é: " + diferenca);
		System.out.println("A média das idades é: " + media);
		
	}

}
