package semana06;

public abstract class InterruptorFlex {
	public static void acionar(Lampada lampada) {
		lampada.status = !lampada.status;
	}
}
