package loops;
import java.util.Scanner;

public class ExerciseFive {

	public static void main(String[] args) {
		
		/*5. Altere o programa 4 permitindo ao usuário informar as populações e as 
		 *   taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.*/
		
		Scanner scan = new Scanner(System.in);
		
		int paisA, paisB;
		int ano = 0;
		double taxA, taxB, totalA, totalB;
		
		System.out.print("Informe a polulação do primeiro país:");
		paisA = scan.nextInt();
		scan.nextLine();
		
		System.out.print("Informe a taxa de crescimento do primeiro país:");
		taxA = Double.parseDouble(scan.nextLine());
		
		System.out.print("Informe a polulação do segundo país:");
		paisB = scan.nextInt();
		scan.nextLine();
		
		System.out.print("Informe a taxa de crescimento do segundo país:");
		taxB = Double.parseDouble(scan.nextLine());
		
		 System.out.println("Ano: " + ano);
		 System.out.println("população do primeiro país: " + paisA + " mil");
		 System.out.println("população do segundo país: " + paisB + " mil");
		 
		if (taxA < taxB && paisA < paisB) {
			System.out.println("O segundo país nunca alcançara o primeiro em população");
		}else if(paisB < paisA) {
			System.out.println("O primeiro país deve ser o menor entre os dois");
		}else {
			while (paisA < paisB) {
			ano++;
			totalA = paisA * taxA/100;
			totalB = paisB * taxB/100;
			
			paisA += (int)totalA;
			paisB += (int)totalB;
			
			String a = String.format("%,d mil", paisA);
			String b = String.format("%,d mil", paisB);
			
			System.out.println("Ano: " + ano);
			System.out.println("Pupulação primeiro país: " + a);
			System.out.println("Pupulação segundo país: " + b);
			}
		}
	}

}
