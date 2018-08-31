package semana05;

public class Funcionario extends PessoaFisica{
	
	public int salario;

	public Funcionario() {
	}

	public Funcionario(int codigo, String nome, String cpf, String rg) {
		super(codigo, nome, cpf, rg);
	}
	
	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println(this.salario);
	}
	
}
