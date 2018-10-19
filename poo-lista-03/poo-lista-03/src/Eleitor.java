
public class Eleitor extends Pessoa {

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
		return (
				"Deputado Estadual: " + voto.getDeputadoEstadual() + " Partido: " + voto.getDeputadoEstadual().getPartido() + "\n" +
				"Deputado Federal: " + voto.getDeputadoFederal() + " Partido: " + voto.getDeputadoFederal().getPartido() + "\n" + 
				"Senador 01: " + voto.getSenador01() + " Partido: " + voto.getSenador01().getPartido() + "\n" +
				"Senador 02: " + voto.getSenador02() + " Partido: " + voto.getSenador02().getPartido() + "\n" +
				"Governador: " + voto.getGovernador() + " Partido: " + voto.getGovernador().getPartido() + "\n" +
				"Presidente: " + voto.getPresidente()  + " Partido: " + voto.getPresidente().getPartido()
		);
	}

}
