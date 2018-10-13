
public class Votos {
	
	private int numero;
	private Candidato deputadoFederal;
	private Candidato deputadoEstadual;
	private Candidato senador01;
	private Candidato senador02;
	private Candidato governador;
	private Candidato presidente;

	public Votos(
			Candidato deputadoEstadual,
			Candidato deputadoFederal,
			Candidato senador01,
			Candidato senador02,
			Candidato governador,
			Candidato presidente
			){
		
		setDeputadoEstadual(deputadoEstadual);
		setDeputadoFederal(deputadoFederal);
		setSenador01(senador01);
		setSenador02(senador02);
		setGovernador(governador);
		setPresidente(presidente);		
	}
	
	protected int getNumero() {
		return numero;
	}
	protected void setNumero(int numero) {
		this.numero = numero;
	}
	protected Candidato getDeputadoFederal() {
		return deputadoFederal;
	}
	protected void setDeputadoFederal(Candidato deputadoFederal) {
		this.deputadoFederal = deputadoFederal;
	}
	protected Candidato getDeputadoEstadual() {
		return deputadoEstadual;
	}
	protected void setDeputadoEstadual(Candidato deputadoEstadual) {
		this.deputadoEstadual = deputadoEstadual;
	}
	protected Candidato getSenador01() {
		return senador01;
	}
	protected void setSenador01(Candidato senador01) {
		this.senador01 = senador01;
	}
	protected Candidato getSenador02() {
		return senador02;
	}
	protected void setSenador02(Candidato senador02) {
		this.senador02 = senador02;
	}
	protected Candidato getGovernador() {
		return governador;
	}
	protected void setGovernador(Candidato governador) {
		this.governador = governador;
	}
	protected Candidato getPresidente() {
		return presidente;
	}
	protected void setPresidente(Candidato presidente) {
		this.presidente = presidente;
	}
	
}
