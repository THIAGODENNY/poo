package semana04;

public class Motor {
	
	private boolean status;
	private byte velocidade;
	private final byte VELOCIDADE_MAXIMA = 100;
	private final byte VELOCIDADE_MINIMA = 0;
	
	public void ligar() {
		this.status = true;
	}
	
	public void desligar() {
		this.status = false;
	}
	
	public void acelerar() {
		if(this.velocidade < VELOCIDADE_MAXIMA) {
			this.velocidade++;
		}
	}
	
	public void frear() {
		if(this.velocidade > VELOCIDADE_MINIMA) {
			this.velocidade--;
		}
	}
	
	public void mostrar() {
		System.out.println(status);
		System.out.println(velocidade);
	}

}
