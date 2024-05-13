package exercise1;

public class Tempo {
	
	private int hora, minutos, segundos;
	
	public void setHora(int h) {
		
		hora = h;
	}
	
	public void setMinutos(int m) {
		
		minutos = m;
	}
	
	public void setSegundo(int s) {
		segundos = s;
	}
	
	public int converter() {
		
		return (hora * 3600 + 60 * minutos + segundos);
	}

}
