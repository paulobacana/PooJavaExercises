package loops;
import java.util.Scanner;

public class ExerciseTwo {
	
	public static void main(String [] args) {
		
		/*2. Faça um programa que leia um nome de usuário e a sua senha e 
		 *   não aceite a senha igual ao nome do usuário, mostrando uma 
		 *   mensagem de erro e voltando a pedir as informações.*/
		
		Scanner scan = new Scanner(System.in);
		
		String nome, senha; 
		
		do {
			System.out.print("Insira um nome de usuário:");
			nome = scan.nextLine();
			System.out.print("Insira uma senha:");
			senha = scan.nextLine();
			
			if (nome.equals(senha)) {
				System.out.println("nome de usuário e senha iguais");
			}else {
				System.out.println("fim do programa");
			}
		}while(nome.equals(senha));
		
	}

}
