
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		
		Ui.atualizaCandidatos(candidatos);
	
		
		
		Ui.confirmaButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Eleitor eleitor = new Eleitor();
				eleitor.setNome("Pedrinho");
				eleitor.setNumeroTitulo(123);
				
				eleitor.setVoto(new Votos(
						Candidato.procuraCandidato(candidatos, Integer.parseInt(Ui.getDeputadoEstadualIn())), 
						Candidato.procuraCandidato(candidatos, Integer.parseInt(Ui.getDeputadoFederalIn())), 
						Candidato.procuraCandidato(candidatos, Integer.parseInt(Ui.getSenador01In())), 
						Candidato.procuraCandidato(candidatos, Integer.parseInt(Ui.getSenador02In())), 
						Candidato.procuraCandidato(candidatos, Integer.parseInt(Ui.getGovernadorIn())), 
						Candidato.procuraCandidato(candidatos, Integer.parseInt(Ui.getPresidenteIn()))
				));
				
				Ui.setResultado(eleitor.toString());
				
			}
		});
		

	}

}
