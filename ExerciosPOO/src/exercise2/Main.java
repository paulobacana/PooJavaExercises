package exercise2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();

		int idade;
		String nome;
		
		System.out.println("Insira o nome da pessoa: ");
		nome = scan.nextLine();
		
		System.out.println("Insira da idade da pessoa: ");
		idade = scan.nextInt();
		
		pessoa.setNome(nome);
		pessoa.setIdade(idade);
		
		System.out.println("O nome da pessoa é: " + pessoa.getNome() + "\ne sua idade é: " + pessoa.getIdade());
	}

}
