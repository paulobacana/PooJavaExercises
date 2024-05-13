package exercise5;
import java.util.Scanner;
import java.util.ArrayList;
//import java.util.Random;
 
public class Main {
	
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Produto> estoque = new ArrayList<Produto>();
		
		int escolha;
			do {
				try {
					System.out.println("---------------------");
					System.out.println("Pressione");
					System.out.println("1 para adicionar um novo produto");
					System.out.println("2 para exibir produtos");
					System.out.println("3 para excluir produto");
					System.out.println("4 para atualizar quantidade disponível");
					System.out.println("---------------------");
					escolha = scan.nextInt();
					switch(escolha) {
						case 1:
							adicionarProduto(scan, estoque);
						break;
						case 2:
							exibirProduto(estoque);
						break;
						case 3:
							deletarProduto(scan, estoque);
						break;
						default:
							System.out.println("deu erro");
						break;
					}
			}catch(Exception e){
				System.out.println("coloca um dos números acima");
				scan.nextLine();
				escolha = 10;
			}
				
			}while(escolha!=0);
		
	}
	
	public static void adicionarProduto(Scanner scan, ArrayList<Produto> estoque) {
		scan.nextLine();
		
		System.out.println("Insira o nome do produto:");
		String nome  = scan.nextLine();
		System.out.println("Insira 	o preço do produto:");
		double preco = scan.nextDouble();
		System.out.println("Insira a quantidade no estoque:");
		int qtd_estoque = scan.nextInt();
		
		Produto novoProduto = new Produto(nome, qtd_estoque, preco);
		estoque.add(novoProduto);
		
		
	}
	
	public static void exibirProduto(ArrayList<Produto> estoque) {
		for(Produto produto : estoque) {
			System.out.println("---------------------------------");
			System.out.println("Nome: " + produto.getNome());
			System.out.println("Preço: R$ " + produto.getPrecoUnidade());
			System.out.println("Quantidade:  " + produto.getPrecoUnidade());
			System.out.println("codigo: " + produto.getCodigo());
			System.out.println("---------------------------------");
		}
	}
	
	public static void deletarProduto(Scanner scan, ArrayList<Produto> estoque) {
		System.out.println("Informe o cdigo do produto: ");
		int codigo = scan.nextInt();
		
		for(Produto produto: estoque) {
			if(produto.getCodigo() == codigo) {
				estoque.remove(codigo);
				/*System.out.println("Certeza que deseja excluir o produto " + produto.getNome() + "?");
				String confirma = scan.nextLine();
				if (confirma.equals("s")) {
					
				}*/
			}
		}
	}
 
}