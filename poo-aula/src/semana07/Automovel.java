package semana07;

import java.io.Serializable;

public class Automovel implements Motor {

	@Override
	public void ligar() {
		System.out.println("Ligando");

	}

	@Override
	public void desligar() {
		System.out.println("Desligando");

	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando");

	}

	@Override
	public void frear() {
		System.out.println("Freando");

	}

}
