package semana06;

public class Lampada {
	
	protected boolean status;
	
	public void ligar() {
		status = true;
	}
	
	public void desligar() {
		status = false;
	}
	
	public void mostrar() {
		if(status) {
			System.out.println("Ligada");
		}
		else {
			System.out.println("Apagada");
		}
	}

}
