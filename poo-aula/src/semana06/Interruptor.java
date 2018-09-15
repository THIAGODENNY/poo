package semana06;

public class Interruptor {
	
	public Lampada lampada = new Lampada();
	
	public void acionar() {
		lampada.status = !lampada.status;
	}

}
