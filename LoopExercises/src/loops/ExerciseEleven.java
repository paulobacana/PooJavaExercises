package loops;
import java.util.Scanner;

public class ExerciseEleven {

	public static void main(String[] args) {
		
		/*11.Altere o programa 10 anterior para mostrar no final a soma dos números.*/
		
		Scanner scan = new Scanner(System.in);
		int n1, n2;
		int soma = 0;
		
		System.out.print("Insira o primeiro número: ");
		n1 = scan.nextInt();
		System.out.print("Insira o segundo número: ");
		n2 = scan.nextInt();
		
		System.out.println("Os números etre o primeiro e segundo número são: ");
		for (int i = n1; i<=n2; i++) {
			soma += i;
			System.out.println(i);
		}
		
		System.out.print("A soma dos números é: " + soma);
	}

}
