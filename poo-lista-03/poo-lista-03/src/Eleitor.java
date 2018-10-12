
public class Eleitor extends Pessoa{
	
	private int numeroTitulo;
	private int zonaEleitoral;
	private Votos voto;
	
	public int getNumeroTitulo() {
		return numeroTitulo;
	}
	public void setNumeroTitulo(int numeroTitulo) {
		this.numeroTitulo = numeroTitulo;
	}
	public int getZonaEleitoral() {
		return zonaEleitoral;
	}
	public void setZonaEleitoral(int zonaEleitoral) {
		this.zonaEleitoral = zonaEleitoral;
	}
	public Votos getVoto() {
		return voto;
	}
	public void setVoto(Votos voto) {
		this.voto = voto;
	}

	public void vota(
			Candidato deputadoEstadual, 
			Candidato deputadoFederal,	
			Candidato senador01, 
			Candidato senador02, 
			Candidato governador, 
			Candidato presidente
			){
		
		voto.setDeputadoEstadual(deputadoEstadual);
		voto.setDeputadoFederal(deputadoFederal);
		voto.setSenador01(senador01);
		voto.setSenador02(senador02);
		voto.setGovernador(governador);
		voto.setPresidente(presidente);
	}
}
