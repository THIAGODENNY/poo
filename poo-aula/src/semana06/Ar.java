package semana06;

public class Ar {
	
	public String fabricante;
	private int temperatura;

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	public void aumentar() {
		temperatura++;
	}
	public void reduzir() {
		temperatura--;
	}
	public void mostrar() {
		System.out.println(temperatura);
	}
	
}
