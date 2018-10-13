
public class Partido {
	private int codigo;
	private String sigla;
	private String nome;
	
	public Partido(int codigo , String sigla , String nome) {
		setCodigo(codigo);
		setSigla(sigla);
		setNome(nome);
	}
	
	public int getCodigo() {
		return codigo;
	}
	private void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getSigla() {
		return sigla;
	}
	private void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getNome() {
		return nome;
	}
	private void setNome(String nome) {
		this.nome = nome;
	}
	
	public static Partido procuraPartido(Partido[] partido , int codigoPartido) {
		
		for (int i = 0; i < partido.length; i++) {
			if(partido[i].getCodigo() == codigoPartido) {
				return partido[i];
			}
		}
		
		return null;
	}
	
	@Override
	public String toString() {
		return getNome();
	}
	
}
