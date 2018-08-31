package semana05;

public class PessoaFisica extends Pessoa {
	
	public String cpf;
	public String rg;
	
	public PessoaFisica() {
		
	}
	
	public PessoaFisica(int codigo, String nome, String cpf, String rg) {
		super.codigo = codigo;
		super.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}

	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println(this.cpf);
		System.out.println(this.rg);
	}
	
}
