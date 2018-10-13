
public class Urna {
	
	public static void main(String[] args) {
		
		//Gerador de Partido
		
		int[] codigoPartido = {
				1 , 
				2 , 
				3 , 
				4 , 
				5 , 
				6
		};
		
		String[] nomePartido = {
				"BlaBlaBla" , 
				"BlaBlaBla" , 
				"BlaBlaBla" , 
				"BlaBlaBla" , 
				"BlaBlaBla" , 
				"BlaBlaBla"
		};
		
		String[] siglaPartido = {
				"XYZ" ,
				"XYZ" ,
				"XYZ" ,
				"XYZ" ,
				"XYZ" ,
				"XYZ" ,
		};
		
		Partido[] partido = new Partido[codigoPartido.length];
		
		for (int i = 0; i < codigoPartido.length; i++) {
			partido[i] = new Partido(codigoPartido[i], siglaPartido[i], nomePartido[i]);
		}

		Candidato c1 = new Candidato();
		c1.setNumero(999);
		c1.setNome("NhoNhoNho");
		c1.setCargo("presidente");
		c1.setPartido(partido[2]);
		
		Eleitor e = new Eleitor();
		e.setNome("Pedrinho");
		e.setNumeroTitulo(123);
		
		e.setVoto(new Votos(c1, c1, c1, c1, c1, c1));
		
		System.out.println(e);
		
		
				
	}

}
