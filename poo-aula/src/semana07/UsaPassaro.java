package semana07;

import semana01.UsaExemplo05Usuario;

public class UsaPassaro {
	
	public static void main(String[] args) {
		Urubu urubu = new Urubu();
		Andorinha andorinha = new Andorinha();
		
		urubu.cantar();
		urubu.comer();
		urubu.voar();
		
		andorinha.cantar();
		andorinha.voar();
	}

}
