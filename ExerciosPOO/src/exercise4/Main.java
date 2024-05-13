package exercise4;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Funcionario> equipe = new ArrayList<Funcionario>();
		int escolha;
		
		do {
			System.out.println("Pressione");
			System.out.println("1 para adicionar novos funcionários");
			System.out.println("2 para exibir informações sobre todos os funcionários");
			System.out.println("3 para calcular salário total da equipe");
			System.out.println("0 para sair");
			escolha = scan.nextInt();
			
			switch(escolha) {
				case 1:
					cadastrarFuncionario(scan, equipe);
					break;
				case 2:
					exibirFuncionarios(equipe);
					break;
				case 3: 
					calcularSalarioTotal(equipe);
					break;
			}
			
		}while(escolha != 0);

	}
	
	public static void cadastrarFuncionario(Scanner scan, ArrayList<Funcionario> equipe) {
		scan.nextLine();
		
		System.out.println("Insira o nome do funcionário: ");
		String nome = scan.nextLine();
		
		System.out.println("Insira o cargo do funcionário: ");
		String cargo = scan.nextLine();
		
		System.out.println("Insira o salário do funcionário: ");
		double salario = scan.nextDouble();
		
		Funcionario novoFuncionario = new Funcionario(nome, cargo, salario);
		equipe.add(novoFuncionario);
		
		System.out.println("Funcionário adicionado com sucesso!");
	}
	
	public static void exibirFuncionarios(ArrayList<Funcionario> equipe) {
		for(Funcionario funcionario: equipe) {
			System.out.println("Nome: " + funcionario.getNome());
			System.out.println("Cargo: " + funcionario.getCargo());
			System.out.println("Salário: " + funcionario.getSalario());
			System.out.println("---------------------------------");
		}
	}
	
	public static void calcularSalarioTotal(ArrayList<Funcionario> equipe) {
		double salarioTotal = 0;
		
		for(Funcionario funcionario: equipe) {
			salarioTotal += funcionario.getSalario();
		}
		
		System.out.println("Salário total dos funcionários: R$ " + salarioTotal);
	}
	
	

}
