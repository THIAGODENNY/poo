package semana06;

public class UsaCasa {
	
	public static void main(String[] args) {
		Casa casa = new Casa();
		casa.sala.lampada.mostrar();
		casa.sala.lampada2.mostrar();
		casa.sala.lampada.ligar();
		casa.sala.lampada2.ligar();
		casa.sala.lampada.mostrar();
		casa.sala.lampada2.mostrar();
		
		casa.sala.ar.setTemperatura(20);
		casa.sala.ar.aumentar();
		casa.sala.ar.mostrar();
	}

}
