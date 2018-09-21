package semana07;

public class Urubu implements Passaro, Alimentar {

	@Override
	public void comer() {
		System.out.println("Urubu comendo");
		
	}

	@Override
	public void voar() {
		System.out.println("Urubu voando");
		
	}

	@Override
	public void cantar() {
		System.out.println("Urubu cantando");
		
	}
	
	

}
