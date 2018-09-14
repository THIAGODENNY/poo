package semana06;

public class Pessoa {

	public int codigo;
	public String nome;
	public Pessoa conjuge;

	public void mostrar() {
		System.out.println(this.codigo);
		System.out.println(this.nome);

		if (this.conjuge != null) {
			System.out.println("Conjuge: " + this.conjuge.nome);
		}
	}
}
