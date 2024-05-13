package exercise3;
import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		ContaBancaria conta = new ContaBancaria();
		
		String titular;
		double valor;
		int numeroConta;
		int escolha;
		
		System.out.println("Insira o nome do titular da conta: ");
		titular = scan.nextLine();
		
		System.out.println("Insira o valor inicial da conta: ");
		valor = scan.nextDouble();
		
		numeroConta = random.nextInt(1000, 10000);
		
		conta.setTitular(titular);
		conta.setSaldo(valor);
		conta.setNumeroConta(numeroConta);

		do {
		System.out.println("----------------------------------------");
		System.out.println("O que você gostaria de fazer?\n");
		System.out.println("Pressione");
		System.out.println("1 para exibir saldo da conta");
		System.out.println("2 para depositar dinheiro na conta");
		System.out.println("3 para sacar dinheiro da conta");
		System.out.println("0 para sair do sistema");
		System.out.println("----------------------------------------");
		
		escolha = scan.nextInt();
		
		switch(escolha) {
		
		case 1:
			System.out.println("*************************");
			conta.exibirDados();
			System.out.println("*************************");
			break;
		case 2:
			System.out.println("*************************");
			System.out.println("Digite o valor que deseja depositar: ");
			double deposito;
			deposito = scan.nextDouble();
			conta.depositar(deposito);
			System.out.println("*************************");
			break;
		case 3:
			System.out.println("*************************");
			System.out.println("Digite o valor que deseja sacar: ");
			double saque;
			saque = scan.nextDouble();
			conta.sacar(saque);
			System.out.println("*************************");
			break;
		}
		}while(escolha != 0);
		
	}
}
