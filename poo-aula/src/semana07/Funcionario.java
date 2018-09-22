package semana07;

public class Funcionario {
	
	public String nome;
	public double salario;
	public static String empresa;
	public static int numeroFuncionarios;
	
	public Funcionario() {
		numeroFuncionarios++;
	}
	
	public Funcionario(String nome) {
		this.nome = nome;
		numeroFuncionarios++;
	}
	
	public void mostrar() {
		System.out.println(nome);
		System.out.println(salario);
		System.out.println(empresa);
	}
	
	public static void verSalario() {
		System.out.println(empresa);
	}
	
	public static void verNumeroFuncionarios() {
		System.out.println(numeroFuncionarios);
	}

}
