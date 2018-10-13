
public class Candidato extends Pessoa{
	
	private int numero;
	private Partido partido;
	private String cargo;
	
	public Candidato(int numero , String nome , String cargo , Partido partido) {
		setNumero(numero);
		setNome(nome);
		setCargo(cargo);
		setPartido(partido);
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Partido getPartido() {
		return partido;
	}
	public void setPartido(Partido partido) {
		this.partido = partido;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public static Candidato procuraCandidato(Candidato[] candidato , int numeroCandidato) {
		
		for (int i = 0; i < candidato.length; i++) {
			if(candidato[i].getNumero() == numeroCandidato) {
				return candidato[i];
			}
		}
		
		return null;
	}
	
	@Override
	public String toString() {
		return new Integer(this.getNumero()).toString();
	}
	
}
