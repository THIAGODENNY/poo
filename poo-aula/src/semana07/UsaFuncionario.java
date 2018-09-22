package semana07;

public class UsaFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.nome = "João";
		funcionario.salario = 10000;
		funcionario.empresa = "XYZ";
		
		funcionario.mostrar();
		funcionario.verNumeroFuncionarios();
		
		Funcionario funcionario2 = new Funcionario("Maria");
		
		funcionario2.salario = 20000;
		funcionario2.empresa = "Fatec";
		
		funcionario.verNumeroFuncionarios();
		
		funcionario.mostrar();
		funcionario2.mostrar();
		
		
	}

}
