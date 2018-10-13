
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
	
	@Override
	public String toString() {
		return(	
				"Deputado Estadual: " + voto.getDeputadoEstadual() +
				"Deputado Federal: " + voto.getDeputadoFederal() +
				"Senador 01: " + voto.getSenador01() +
				"Senador 02: " + voto.getSenador02() +
				"Governador: " + voto.getGovernador() +
				"Presidente: " + voto.getPresidente()
				);
	}

}
