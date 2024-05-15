/*Crie um sistema para uma biblioteca que permita o cadastro de livros e o registro de empréstimos. 
Cada livro deve ter atributos como título, autor, ano de publicação e disponibilidade.
Implemente métodos para emprestar e devolver livros, além de exibir informações sobre os livros cadastrados.*/

package exercise.biblioteca;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<Livro> biblioteca = new ArrayList<Livro>();
		
		int escolha;
		do {
			System.out.println("-------------------------");
			System.out.println("Pressione");
			System.out.println("1 para cadastrar livro");
			System.out.println("2 para listar livros");
			System.out.println("3 para emprestar livro");
			System.out.println("0 para sair");
			System.out.println("-------------------------");
			escolha = scan.nextInt();
			
			switch(escolha) {
			case 1:
				cadastrarLivros(scan, biblioteca);
			break;
			case 2:
				listarLivros(biblioteca);
			break;
			case 3:
				emprestarLivros(scan, biblioteca);
			break;
			}
		}while(escolha!=0);
	}
	
	private static void cadastrarLivros(Scanner scan, ArrayList<Livro> biblioteca) {
		scan.nextLine();
		System.out.println("Insira o nome do livro");
		String titulo = scan.nextLine();
		System.out.println("Insira o nome do autor");
		String autor = scan.nextLine();
		System.out.println("Insira o ano do livro");
		int ano = scan.nextInt();
		System.out.println("Insira a quantidade de livos");
		int qtd = scan.nextInt();
		//System.out.println("O livro está diponível?");
		//String disponivel = scan.nextLine();
		
		Livro livros = new Livro(titulo, autor, ano, qtd);
		biblioteca.add(livros);
		
	}
	
	private static void listarLivros(ArrayList<Livro> biblioteca) {
		for (Livro livros: biblioteca) {
			System.out.println("-------------------------");
			System.out.println("Id: " + livros.getId());
			System.out.println("Titulo: " + livros.getTitulo());
			System.out.println("Autor: " + livros.getAutor());
			System.out.println("Ano: " + livros.getAnoPublicacao());
			System.out.println("Quantidade: " + livros.getQuantidade());
			//System.out.println("Disponibilidade: " + livros.get());
		}
	}
	
	private static void emprestarLivros(Scanner scan, ArrayList<Livro> biblioteca) {
		System.out.println("Qual Livro abaixo gostaria de emprestar?\n");
		listarLivros(biblioteca);
		String status = scan.nextLine();
		
	}

}
