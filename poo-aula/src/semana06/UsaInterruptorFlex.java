package semana06;

public class UsaInterruptorFlex {
	public static void main(String[] args) {
		Lampada lampada1 = new Lampada();
		Lampada lampada2 = new Lampada();
		
		lampada1.mostrar();
		lampada2.mostrar();
		InterruptorFlex.acionar(lampada1);
		InterruptorFlex.acionar(lampada2);
		lampada1.mostrar();
		lampada2.mostrar();
		
		
	}
}
