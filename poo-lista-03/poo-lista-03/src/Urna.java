
public class Urna {
	
	public static void main(String[] args) {
	
		Partido p1 = new Partido();
		p1.setCodigo(1);
		p1.setNome("BlaBlaBla");
		p1.setSigla("XYZ");
		
		Candidato c1 = new Candidato();
		c1.setNumero(999);
		c1.setNome("NhoNhoNho");
		c1.setCargo("presidente");
		c1.setPartido(p1);
		
		Eleitor e = new Eleitor();
		e.setNome("Pedrinho");
		e.setNumeroTitulo(123);
		
		Votos voto = new Votos(c1);
				
	}

}
