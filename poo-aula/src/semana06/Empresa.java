package semana06;

public class Empresa {
	
	public static void main(String[] args) {
		Cargo c = new Cargo();
		c.codigo = 1;
		c.nome = "Programador";
		c.salarioMedio = 10000;
		
		Funcionario f1 = new Funcionario();
		f1.codigo = 1;
		f1.nome = "Maria";
		f1.numCartao = 100;
		f1.cargo = c;
		f1.mostrar();
		
		Funcionario f2 = new Funcionario();
		f2.codigo = 2;
		f2.nome = "Carlos";
		f2.numCartao = 100;
		f2.cargo = c;
		f2.mostrar();	
	}
}
