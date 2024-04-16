package loops;
import java.util.Scanner;

public class ExcerciseThree {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*3. Faça um programa que leia e valide as seguintes informações:

			a. Nome: maior que 3 caracteres;
			
			b. Idade: entre 0 e 150;
			
			c. Salário: maior que zero;
			
			d. Sexo: 'f' ou 'm';
			
			e. Estado Civil: 's', 'c', 'v', 'd';*/
		
		String nome, sexo, estadoCivil;
		int idade;
		double salario;
		
		do {
			System.out.print("Insira seu nome:");
			nome = scan.nextLine();
			
			System.out.print("Insira sua idade:");
			idade = scan.nextInt();
			scan.nextLine();
			
			System.out.print("Insira seu salário:");
			salario = scan.nextDouble();
			scan.nextLine();
			
			System.out.print("Insira seu sexo:");
			sexo = scan.nextLine();
			
			System.out.print("Insira seu estado civil:");
			estadoCivil = scan.nextLine();
			
			
			if (nome.length() <3) {
				System.out.println("Nome incorreto, deve conter mais de 3 letras");
			}
			if (idade < 0 || idade >150) {
				System.out.println("Idade incorreta, deve informar uma idade entre 0 e 150");
			}
			if (salario <0 ){
				System.out.println("Salário incorreto, deve ser maior que 0");
			}
			if (!sexo.equals("f") && !sexo.equals("m")) {
				System.out.println("Sexo incorreto, deve ser informado \"m\" ou \"f\" ");
			}
			if (!estadoCivil.equals("s") &&
					 !estadoCivil.equals("c") &&
					 !estadoCivil.equals("v") &&
					 !estadoCivil.equals("d")) {
				System.out.println("Estado civil incorreto, deve ser informado \"s\" , \"c\" \"v\" ou \"d\"");
			}
			
		}while(nome.length() < 3 || idade <0 || idade >150 ||  salario < 0 || 
				!sexo.equals("f") && 
				!sexo.equals("m") ||
				!estadoCivil.equals("s") &&
				!estadoCivil.equals("c") &&
				!estadoCivil.equals("v") &&
				!estadoCivil.equals("d"));
					
	}

}
