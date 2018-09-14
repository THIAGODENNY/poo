package semana06;

public class Funcionario extends Pessoa{
	
	public int numCartao;
	public Cargo cargo;
	
	public void mostrar() {
		super.mostrar();
		System.out.println(numCartao);
		System.out.println(cargo.nome);
	}
}
