
public class Urna extends Ui{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		
		//Gerador de Partido
		
		Ui.startUI();
		
		int[] codigoPartido = {
				1 , 
				2 , 
				3 , 
				4 , 
				5 , 
				6
		};
		
		String[] siglaPartido = {
				"can" ,
				"soa" ,
				"rub" ,
				"pic" ,
				"rin" ,
				"pla" ,
		};
		
		String[] nomePartido = {
				"candle" , 
				"soap" , 
				"rubber duck" , 
				"picture frame" , 
				"ring" , 
				"plate"
		};
				
		Partido[] partidos = new Partido[siglaPartido.length];
		
		for (int i = 0; i < partidos.length; i++) {
			partidos[i] = new Partido(codigoPartido[i], siglaPartido[i], nomePartido[i]);
		}
				
		//gerador de candidato
		int[] numeroCandidato = {
				11 ,
				21 ,
				31 ,
				41 ,
				51 ,
				61 ,			
		};
		
		String[] nomeCandidato = {
				"Lexi Doyle" ,
				"Carter Landry" ,
				"Jocelyn Bishop" ,
				"Junior Everett" ,
				"Adalynn Francis" ,
				"Jace Merritt"
		};
		
		String[] cargoCandidato = {
				"Deputado Estadual" , 
				"Deputado Federal" , 
				"Senador" ,
				"Senador" ,
				"Governador" ,
				"Presidente"				
		};
		
		Partido[] partido = {
				Partido.procuraPartido(partidos, 1) , 
				Partido.procuraPartido(partidos, 2) ,
				Partido.procuraPartido(partidos, 3) ,
				Partido.procuraPartido(partidos, 4) ,
				Partido.procuraPartido(partidos, 5) ,
				Partido.procuraPartido(partidos, 6) ,
		};
		
		Candidato[] candidatos = new Candidato[numeroCandidato.length];
		
		for (int i = 0; i < candidatos.length; i++) {
			candidatos[i] = new Candidato(numeroCandidato[i], nomeCandidato[i], cargoCandidato[i], partido[i]);
		}
		
		Eleitor e = new Eleitor();
		e.setNome("Pedrinho");
		e.setNumeroTitulo(123);
		
		e.setVoto(new Votos(
				Candidato.procuraCandidato(candidatos, 11), 
				Candidato.procuraCandidato(candidatos, 21), 
				Candidato.procuraCandidato(candidatos, 31), 
				Candidato.procuraCandidato(candidatos, 41), 
				Candidato.procuraCandidato(candidatos, 51), 
				Candidato.procuraCandidato(candidatos, 61)
		));

		System.out.println(e);
		
		Ui.setResultado(e.toString());
	}

}
