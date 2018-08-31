package semana05;

public class TestaPessoaFisica {
	
	public static void main(String[] args) {
		PessoaFisica pessoaFisica = new PessoaFisica(123,"Thiago", "333333", "444444444");
		
		pessoaFisica.nome = "thiago";
		pessoaFisica.codigo = 12344;
		pessoaFisica.mostrar();
	}
}
