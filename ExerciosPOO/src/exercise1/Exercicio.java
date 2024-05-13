package exercise1;

public class Exercicio {
	
	public static void main(String [] args) {
		
		Tempo t1 = new Tempo();
		Tempo t2 = new Tempo();
		
		t1.setHora(8);
		t1.setMinutos(27);
		t1.setSegundo(50);
		
		int c1 = t1.converter();
		
		System.out.println(c1);
	}

}
