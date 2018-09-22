package semana07;

public class Vida {
	
	public static void viver(Fisio f) {
		f.comer();
		f.beber();
		f.andar();
		f.dormir();
	}
	
	public static void main(String[] args) {
		Animale animale = new Animale();
		viver(animale);
	}

}
